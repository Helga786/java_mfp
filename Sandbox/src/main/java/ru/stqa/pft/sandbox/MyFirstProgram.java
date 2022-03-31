package ru.stqa.pft.sandbox;

public class MyFirstProgram{

  public static void main(String[] args) {
	System.out.println("Hello, world!");

    Point P1 = new Point(1,3);
    Point P2 = new Point(0,3);
    System.out.println("Расстояние между двумя точками с координатами (" + P1.x + "," + P1.y + ") и (" + P2.x  + "," + P2.y + ") = " + distance(P1,P2));
    System.out.println("Расстояние между двумя точками с координатами (" + P1.x + "," + P1.y + ") и (" + P2.x  + "," + P2.y + ") = " + PointMethod.distance(P1,P2));
  }

  public static double distance (Point P1, Point P2){
    double x1 = P1.x-P2.x;
    double y1 = P1.y-P2.y;
    return Math.sqrt(x1*x1+y1*y1);
  }

}