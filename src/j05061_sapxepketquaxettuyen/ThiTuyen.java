package j05061_sapxepketquaxettuyen;

import java.util.Collections;

public class ThiTuyen implements Comparable<ThiTuyen> {
    private String ma,ten;
    private int tuoi,dtb;
    private String xl;
    private static int cnt=1;
    public ThiTuyen(String ten, String ns, double dlt, double th) {
        this.ma = String.format("PH%02d",cnt++);
        this.ten = ten;
        this.tuoi = 2021-Integer.parseInt(ns.substring(ns.length()-4,ns.length()));
        double tong = (dlt+th)/2;
        if(dlt>=8 && th>=8) tong += 1;
        else if(dlt>=7.5 && th>=7.5) tong += 0.5;
        if(tong>10) this.dtb = 10;
        else this.dtb = (int) Math.round(tong);

        if(this.dtb==9 || this.dtb==10) this.xl = "Xuat sac";
        else if(this.dtb==8) this.xl = "Gioi";
        else if(this.dtb==7) this.xl = "Kha";
        else if(this.dtb==5 || this.dtb==6) this.xl = "Trung binh";
        else if(this.dtb<5) this.xl = "Truot";
    }

    @Override
    public String toString() {
        return ma +" " + ten + ' ' + tuoi + " " + dtb + " " + xl;
    }

    @Override
    public int compareTo(ThiTuyen o) {
        if(this.dtb==o.dtb){
            return this.ma.compareTo(o.ma);
        }
        return Integer.compare(o.dtb,this.dtb);
    }
}
