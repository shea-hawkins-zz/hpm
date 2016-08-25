package io.bapm;

class BazelSpice extends Spice {
  public BazelSpice() {
    Command init = new InitCommand();
    Action initAction = new InitAction();
    this.addCommandAction(init, initAction, {"init"});

    Command install = new InstallCommand();
    Action installAction = new InstallAction();
    this.addCommandAction(install, installAction, {"install", "i"});
  }
}
