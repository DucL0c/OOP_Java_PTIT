package j04010_dientichhinhtronngoaitieptamgiac;

import java.util.Scanner;

public class Main {
    public static double distance(Point a, Point b){
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            double A = a.distance(b);
            double B = b.distance(c);
            double C = c.distance(a);
            if(A+B>C && B+C>A && A+C>B){
                double p = (A + B + C) / 2.0;
                double s = Math.sqrt(p * (p - A) * (p - B) * (p - C));
                double r = (A*B*C)/(4*s);
                System.out.println(String.format("%.3f",Math.PI*r*r));
            }
            else
                System.out.println("INVALID");

        }
    }
}
//class Point {
//    private double x,y,dick;
//    public Point(){}
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public Point(Point a){
//        this.x = a.x;
//        this.y = a.y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    public double distance(Point a){
//        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
//    }
//
//    public void setDick(double dick) {
//        this.dick = dick;
//    }
//
//    public double getDick() {
//        return dick;
//    }
//
//    public String toString(){
//        return String.format("%.3f",dick);
//    }
//}
