package j04001_khaibaoloppoint;

public class Point {
    private double x,y,ans;
    public Point() {}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
    }

    public void setAns(double ans) {
        this.ans = ans;
    }
    public String toString(){
        return String.format("%.4f",this.ans);
    }
}
