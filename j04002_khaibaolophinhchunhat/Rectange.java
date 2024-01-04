package j04002_khaibaolophinhchunhat;

import java.text.DecimalFormat;

public class Rectange {
    private double width,height;
    private String color;
    public Rectange(){
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return this.height*this.width;
    }
    public double findPerimeter(){
        return (this.width+this.height)*2;
    }
    public String toString(){
        DecimalFormat f = new DecimalFormat("#");
        return f.format(findPerimeter()) + " " + f.format(findArea()) + " " +getColor();
    }
}
