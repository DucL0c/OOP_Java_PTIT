package j04019_loptriangle1;

import java.util.Scanner;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point a = new Point(x,y);
        return a;
    }
    public double distance(Point a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
    }
}
