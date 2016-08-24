package io.bapm;

import java.util.ArrayList;
import com.beust.jcommander.JCommander;

public abstract class Command {
  public ArrayList<String> names = new ArrayList<String>();
  private final Action action;
  public void execute(JCommander jc) {
    action.execute(jc);
  }
}
