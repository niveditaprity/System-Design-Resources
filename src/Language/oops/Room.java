package Language.oops;
public class Room {
    private int door=1;
    public int window=2;
    private int bed=1;
    protected int almirah=1;

    public void setDoor(int door) {
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setAlmirah(int almirah) {
        this.almirah = almirah;
    }

    public int getAlmirah() {
        return almirah;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBed() {
        return bed;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getWindow() {
        return window;
    }
}
