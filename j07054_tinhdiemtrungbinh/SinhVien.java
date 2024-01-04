package j07054_tinhdiemtrungbinh;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten;
    private double tb;
    private int xh;
    private static int cnt = 1;

    public SinhVien(String ten, int d1, int d2, int d3) {
        this.ma = String.format("SV%02d",cnt++);
        ten = ten.toLowerCase().trim();
        String[] s = ten.split("\\s+");
        this.ten = "";
        for(String i:s){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
        }
        this.tb = (double)(d1*3 + d2*3 + d3*2) / 8;
    }

    public void setXh(int xh) {
        this.xh = xh;
    }

    public int getXh() {
        return xh;
    }

    public double getTb() {
        return tb;
    }

    @Override
    public String toString() {
        return ma + " " + ten.trim() + " " + String.format("%.2f",tb) + " " + xh;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tb==o.tb){
            return this.ma.compareTo(o.ma);
        }
        return Double.compare(o.tb,this.tb);
    }
}
