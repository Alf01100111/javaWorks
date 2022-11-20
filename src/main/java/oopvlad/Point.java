package oopvlad;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "x: " + this.x + "\ny: " + this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Point point = new Point(5, 3);

        System.out.println(point);
    }
}
