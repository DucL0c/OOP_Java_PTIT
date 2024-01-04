package j04008_chuvitamgiac;

import java.util.Scanner;

public class Main {
    public static double distance(Point a,Point b){
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            a.setDick(a.distance(b));
            b.setDick(b.distance(c));
            c.setDick(c.distance(a));
            double A = a.getDick();
            double B = b.getDick();
            double C = c.getDick();
            if(A+B>C && B+C>A && A+C>B)
                System.out.println(String.format("%.3f",A+B+C));
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
