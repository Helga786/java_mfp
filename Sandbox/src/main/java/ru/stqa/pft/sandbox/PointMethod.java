package ru.stqa.pft.sandbox;

public class PointMethod {

    public double x;
    public double y;

    public PointMethod(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance (Point P1, Point P2){
        double x1 = P1.x-P2.x;
        double y1 = P1.y-P2.y;
        return Math.sqrt(x1*x1+y1*y1);
    }
}
