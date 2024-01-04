package j05009_timthukhoacuakithi;

public class ThiSinh {
    private int maTS;
    private String tenTs,ns;
    private double d1,d2,d3,tong;

    public ThiSinh(int maTS, String tenTs, String ns, double d1, double d2, double d3) {
        this.maTS = maTS;
        this.tenTs = tenTs;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1+d2+d3;
    }

    public double getTong() {
        return tong;
    }

    public String toString(){
        return maTS+" "+tenTs+" "+ns+" "+tong;
    }
}