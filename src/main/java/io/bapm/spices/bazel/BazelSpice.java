package io.bapm;

class BazelSpice extends Spice {
  public BazelSpice() {
    Command init = new InitCommand();
    this.addCommand(init);
    Command install = new InstallCommand();
    this.addCommand(install);
  }
}
