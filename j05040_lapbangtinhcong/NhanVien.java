package j05040_lapbangtinhcong;

public class NhanVien {
    private String ma,ten;
    private double lgt,thg,pc,tl;
    private static int cnt = 1;

    public NhanVien(String ten, double lgn, double snc, String cv) {
        this.ma = String.format("NV%02d",cnt++);
        this.ten = ten;
        this.lgt = lgn*snc;
        this.thg = 0;
        this.pc = 0;

        if(snc>=25) this.thg = this.lgt*20/100;
        else if(snc>=22) this.thg = this.lgt*10/100;

        if(cv.equals("GD")) this.pc = 250000;
        else if(cv.equals("PGD")) this.pc = 200000;
        else if(cv.equals("TP")) this.pc = 180000;
        else if(cv.equals("NV")) this.pc = 150000;

        this.tl = this.lgt +  this.thg + this.pc;
    }

    public double getTl() {
        return tl;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + String.format("%.0f %.0f %.0f %.0f",lgt,thg,pc,tl);
    }
}
