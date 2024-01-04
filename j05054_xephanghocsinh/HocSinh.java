package j05054_xephanghocsinh;

public class HocSinh implements Comparable<HocSinh>{
    private String ma,ten;
    private double dtb;
    private String xl;
    private int xh;
    private static int cnt = 1;

    public HocSinh(String ten, double dtb) {
        this.ma = String.format("HS%02d",cnt++);
        this.ten = ten;
        this.dtb = dtb;
        if(dtb<5) this.xl = "Yeu";
        else if(dtb>=5 && dtb<7) this.xl = "Trung Binh";
        else if(dtb>=7 && dtb<9) this.xl = "Kha";
        else if(dtb>=9) this.xl = "Gioi";
        this.xh = 0;
    }

    public double getDtb() {
        return dtb;
    }

    public void setXh(int xh) {
        this.xh = xh;
    }

    public int getXh() {
        return xh;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + dtb + " " + xl + ' ' + xh;
    }

    @Override
    public int compareTo(HocSinh o) {
        return Double.compare(o.dtb,this.dtb);
    }
}
