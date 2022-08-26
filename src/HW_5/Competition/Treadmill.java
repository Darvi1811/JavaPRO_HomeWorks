package HW_5.Competition;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
