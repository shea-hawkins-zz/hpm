package io.bapm;

import java.util.ArrayList;

public abstract class Spice {
  private ArrayList<Command> commands = new ArrayList<Command>();
  public Spice () {
    commands = new ArrayList<Command>();
  }
  public ArrayList<Command> getCommands() {
    return commands;
  }
  public void addCommand(Command command) {
    commands.add(command);
  }
}
