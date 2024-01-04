package j04002_khaibaolophinhchunhat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String c = sc.next().toLowerCase();
        String tmp = c.substring(0,1).toUpperCase() + c.substring(1,c.length());
        if(x>0 && y>0){
            Rectange p = new Rectange(x,y,tmp);
            System.out.println(p);
        }
        else{
            System.out.println("INVALID");
        }
    }
}
//class Rectange {
//    private double width,height;
//    private String color;
//    public Rectange(){
//        this.width = 1;
//        this.height = 1;
//    }
//    public Rectange(double width, double height, String color) {
//        this.width = width;
//        this.height = height;
//        this.color = color;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public double findArea(){
//        return this.height*this.width;
//    }
//    public double findPerimeter(){
//        return (this.width+this.height)*2;
//    }
//    public String toString(){
//        DecimalFormat f = new DecimalFormat("#");
//        return f.format(findPerimeter()) + " " + f.format(findArea()) + " " +getColor();
//    }
//}
