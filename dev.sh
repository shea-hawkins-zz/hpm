# Temporary file until tty on docker-compose is resolved
# Set env for source path
export BAPM_PATH="//c/Users/sheam/Documents/Projects/OpenSource/bapm"
# runs dev automatically because shell emulators don't persist EXPORT
docker run -it --rm --privileged=true --name bapm-dev -v "$BAPM_PATH/src:/usr/bapm/src:rw" bapm
