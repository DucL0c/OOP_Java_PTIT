package j05057_bangdiemtuyensinh;

import java.text.DecimalFormat;

public class ThiSinh {
    private String ma,ten;
    private double ut,tong;
    private String tt;

    public ThiSinh(String ma, String ten, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        if(ma.substring(0,3).equals("KV1")) this.ut = 0.5;
        else if(ma.substring(0,3).equals("KV2")) this.ut = 1.0;
        else if(ma.substring(0,3).equals("KV3")) this.ut = 2.5;
        this.tong = d1*2+d2+d3;
        if((this.tong+this.ut) >=24 ) this.tt = "TRUNG TUYEN";
        else this.tt = "TRUOT";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return ma + " " + ten + " " + df.format(ut) + " " + df.format(tong) + " " + tt ;
    }
}
