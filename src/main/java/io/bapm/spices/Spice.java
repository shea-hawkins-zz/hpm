package io.bapm;

import java.util.ArrayList;
import java.util.Map;
import com.beust.jcommander.JCommander;

public abstract class Spice {
  private Map<String, Command> commands = new Map<String, Command>();
  private Map<String, Action> actions = new Map<String, Action>();

  public Spice () {
    commands = new ArrayList<Command>();
  }
  public Map<String, Command> getCommands() {
    return commands;
  }
  public void addCommandAction(Command command, Action action, String[] names) {
    for (String name : names) {
      commands[name] = command;
      actions[name] = action;
    }
  }
  public execute(JCommander jc) {
    String targetAction = jc.getParsedCommand();
    actions[targetAction].execute(jc);
  }
}
