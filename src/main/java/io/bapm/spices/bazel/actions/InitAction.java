package bapm.io;

import com.beust.jcommander.JCommander;

class InitAction extends Action {
  public void execute(JCommander jc) {
    System.out.println(jc.getParsedCommand());
  }
}
