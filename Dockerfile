FROM ubuntu:14.04
MAINTAINER spiralsoft

# Install JDK
RUN apt-get update \
      && apt-get install software-properties-common \
      && add-apt-repository ppa:webupd8team/java \
      && apt-get install oracle-java8-installer


# Add Bazel distro
RUN echo deb [arch=amd64] http://storage.googleapis.com/bazel-apt stable jdk1.8" \
| tee /etc/apt/sources.list.d/bazel.list

RUN curl https://storage.googleapis.com/bazel-apt/doc/apt-key.pub.gpg \
| apt-key add -

# Install bazel and dependencies
RUN apt-get update \
    && apt-get install bazel

RUN mkdir -p /usr/bapm
WORKDIR /usr/bapm
COPY BUILD bapm/BUILD
