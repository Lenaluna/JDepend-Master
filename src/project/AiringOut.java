package project;

import door.Door;

public class AiringOut {
    private Door door;

    public AiringOut(final Door door) {
        this.door = door;
    }

    public final void airOut() {
        if (door.isOpen()) {
            System.out.println("The door is already open.");
        } else {
            door.open();
            System.out.println("The door has been opened.");
        }
    }

    public static void main(final String[] args) {
        Door door = new Door();
        AiringOut ao = new AiringOut(door);
        ao.airOut();
    }
}
