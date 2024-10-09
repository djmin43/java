package org.example.commander;

public interface Command {
    public void execute();

    public void undo();
}
