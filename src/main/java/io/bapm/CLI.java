package io.bapm;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class CLI {
  @Parameter(names = {"--verbose"}, description = "Verbose console logging.")
  private Boolean verbose = false;

  public void parse(String[] args) {
    JCommander jc = new JCommander(this);

    InitCommand initCommand = new InitCommand();
    jc.addCommand("init", initCommand);

    InstallCommand installCommand = new InstallCommand();
    // Allows for 'i' abbreviation for installs.
    jc.addCommand("i", installCommand);
    jc.addCommand("install", installCommand);

    jc.parse(args);

    System.out.println(jc.getParsedCommand());
    System.out.println(installCommand.save);
  }
}
