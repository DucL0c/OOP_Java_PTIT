package j04019_loptriangle1;

public class Triangle {
    private double a,b,c;

    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p3.distance(p1);
    }
    public boolean valid(){
        if(a+b>c && b+c>a && a+c>b)
            return true;
        else
            return false;
    }
    public String getPerimeter(){
        return String.format("%.3f",a+b+c);
    }
}
