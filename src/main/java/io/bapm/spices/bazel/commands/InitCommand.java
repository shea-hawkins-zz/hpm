package io.bapm;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(commandDescription = "Initialize a blank package.")
public class InitCommand extends Command {
  public InitCommand() {
    this.names.add("init");
  }

  @Parameter(names = {"-q"}, description = "Quick initialization mode.")
  public Boolean quick = false;
}
