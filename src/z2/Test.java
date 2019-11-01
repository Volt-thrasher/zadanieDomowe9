package z2;

public class Test {
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();
        System.out.println(calc.circleArea(new Circle(4)));
        System.out.println(calc.rectArea(new Rectangle(3,4)));
        System.out.println(calc.lineLength(new Line2D(6)));
    }
}
