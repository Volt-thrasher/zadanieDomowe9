package z2;

import static java.lang.Math.PI;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double rectArea(Rectangle rect) {
        return rect.getA() * rect.getB();
    }

    @Override
    public double circleArea(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * PI;
    }

    public double lineLength(Line2D line) {
        return super.lineLength(line);
    }
}
