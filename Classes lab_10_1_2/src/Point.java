public class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public void draw() {
        System.out.printf("Point coordinates: (%d, %d)\n", this.x, this.y);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
