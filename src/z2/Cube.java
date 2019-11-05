package z2;

public class Cube extends Shape3D {
    private double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public Cube(double sideA) {
        this.sideA = sideA;
    }
}
