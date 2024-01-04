package j04009_dientichtamgiac;

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
            double A = a.distance(b);
            double B = b.distance(c);
            double C = c.distance(a);
            if(A+B>C && B+C>A && A+C>B){
                double p = (A + B + C) / 2.0;
                System.out.println(String.format("%.2f",Math.sqrt(p * (p - A) * (p - B) * (p - C))));
            }
            else
                System.out.println("INVALID");
        }

    }
}
//class Point {
//    private double x,y,ans;
//    public Point(){};
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Point(Point a) {
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
//
//    public double distance(Point a){
//        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
//    }
//    public void setAns(double ans) {
//        this.ans = ans;
//    }
//    public String toString(){
//        return String.format("%.2f",ans);
//    }
//}