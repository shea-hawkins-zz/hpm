package io.bapm;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(commandDescription = "Install a new dependency.")
public class InstallCommand extends Command {
  public InstallCommand () {
    this.names.add("install");
    this.names.add("i");
  }

  @Parameter(names = {"-s", "--save"}, description = "Save to the dependency tree.")
  public Boolean save = false;
}
