package io.bapm;

public class BapmRunner {
  public static void main(String ... args) {
    BapmRunner bapm = new BapmRunner();
    bapm.parseCommands(args);
  }
  public void parseCommands(String[] args) {
    CLI cli = new CLI();
    cli.parse(args);
  }
}
