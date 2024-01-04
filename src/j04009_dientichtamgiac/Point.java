package j04009_dientichtamgiac;

public class Point {
    private double x,y,ans;
    public Point(){};

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point a) {
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

    public double getAns() {
        return ans;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }

    public String toString(){
        return String.format("%.4f",ans);
    }
}