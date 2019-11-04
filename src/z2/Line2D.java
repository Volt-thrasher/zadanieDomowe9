package z2;

public class Line2D extends Shape2D {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Line2D(double length) {
        this.length = length;
    }
}
