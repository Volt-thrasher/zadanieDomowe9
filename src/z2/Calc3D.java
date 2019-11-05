package z2;

public interface Calc3D {

    public static double ballVolume(Ball ball) {
        double volume = 3.14*Math.pow(ball.getRadius(),3)*4/3;
        return volume;
    }

    public static double cubeVolume (Cube cube) {
        double volume = Math.pow(cube.getSideA(),3);
        return volume;
    }
}
