#!/usr/bin/env node
const argv = require('yargs').argv;

if (argv.install) {
  console.log('install, yo!');
} else {
  console.log('don\'t install, you ')
}
