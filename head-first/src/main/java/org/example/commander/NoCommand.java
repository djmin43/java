package org.example.commander;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("no command");
    }

    public void undo() {

    }
}
