package j04001_khaibaoloppoint;

import java.util.Scanner;

public class Main {
    public static double distance(Point a,Point b){
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())
                + (a.getY()-b.getY())*(a.getY()-b.getY()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            a.setAns(distance(a,b));
            System.out.println(a);
        }
    }
}
//class Point {
//    private double x,y,ans;
//    public Point() {}
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public Point(Point p) {
//        this.x = p.x;
//        this.y = p.y;
//    }
//    public double getX() {
//        return x;
//    }
//    public double getY() {
//        return y;
//    }
//    public double distance(Point p){
//        return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
//    }
//
//    public void setAns(double ans) {
//        this.ans = ans;
//    }
//    public String toString(){
//        return String.format("%.4f",this.ans);
//    }
//}