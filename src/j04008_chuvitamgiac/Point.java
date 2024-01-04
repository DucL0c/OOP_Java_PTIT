package j04008_chuvitamgiac;

public class Point {
    private double x,y,dick;
    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point a){
        this.x = a.x;
        this.y = a.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
    }

    public void setDick(double dick) {
        this.dick = dick;
    }

    public double getDick() {
        return dick;
    }

    public String toString(){
            return String.format("%.3f",dick);
    }
}
