package org.example.commander;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        this.garageDoor.up();
        this.garageDoor.stop();
        this.garageDoor.lightOn();
        this.garageDoor.down();
        this.garageDoor.lightOff();
    }

    public void undo() {
        this.garageDoor.stop();
    }
}
