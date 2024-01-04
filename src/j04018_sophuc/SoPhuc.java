package j04018_sophuc;

public class SoPhuc {
    private int x,y;

    public SoPhuc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SoPhuc Cong(SoPhuc b){
        int a = this.x + b.x;
        int d = this.y + b.y;
        SoPhuc c = new SoPhuc(a,d);
        return c;
    }
    public SoPhuc Nhan(SoPhuc b){
        int a = this.x*b.x - this.y*b.y;
        int d = this.x*b.y + this.y*b.x;
        SoPhuc c = new SoPhuc(a,d);
        return c;
    }

    @Override
    public String toString() {
        if(y>0){
            return  x + " + " + y + "i";
        }
        else{
            return  x + " - " + Math.abs(y) + "i";
        }
    }
}
