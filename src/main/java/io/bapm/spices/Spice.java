package io.bapm;

import java.util.ArrayList;
import com.beust.jcommander.JCommander;

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
  public execute(JCommander jc) {
    String targetCommand = jc.getParsedCommand();
    commands.forEach(command -> {
      command.names.forEach(name -> {
        if (name.equals(targetCommand)) {
          command.execute(jc);
        }
    });
  }
}
