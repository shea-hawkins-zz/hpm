package io.bapm;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class CLI {
  // Global flags
  @Parameter(names = {"--verbose"}, description = "Verbose console logging.")
  private Boolean verbose = false;

  public void parse(String[] args) {
    JCommander jc = new JCommander(this);

    // Can swap this section with 'Cabinet' or 'Stew' API for multiple spices.
    Spice spice = new BazelSpice();
    spice.getCommands().forEach((name, command) -> {
      jc.addCommand(name, command);
    });
    jc.parse(args);
    //spice.sendCommand(jc);
  }
}
