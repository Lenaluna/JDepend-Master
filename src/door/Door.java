package door;

public class Door {
    private boolean open;

    public Door() {
        this.open = false;
    }

    public final void open() {
        this.open = true;
    }

    public final void close() {
        this.open = false;
    }

    public final boolean isOpen() {
        return this.open;
    }
}
