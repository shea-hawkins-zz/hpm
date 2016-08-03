FROM ubuntu:14.04
MAINTAINER spiralsoft

# Install JDK & deps
RUN apt-get update \
      && apt-get install -y software-properties-common \
      && apt-get install -y curl \
      && add-apt-repository ppa:webupd8team/java \
	  && echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true \
		 | /usr/bin/debconf-set-selections \
      && apt-get update \
      && apt-get install -y oracle-java8-installer

ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

# Add Bazel distro
RUN echo deb [arch=amd64] "http://storage.googleapis.com/bazel-apt stable jdk1.8" \
    | tee /etc/apt/sources.list.d/bazel.list

RUN curl https://storage.googleapis.com/bazel-apt/doc/apt-key.pub.gpg \
    | apt-key add -

# Install and extract bazel
RUN apt-get update \
    && apt-get install -y bazel \
    && bazel


RUN mkdir -p /usr/bapm
WORKDIR /usr/bapm
COPY BUILD BUILD
