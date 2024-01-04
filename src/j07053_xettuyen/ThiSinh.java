package j07053_xettuyen;

import java.text.DecimalFormat;

public class ThiSinh {
    private String ma, ten;
    private int t;
    private static int cnt = 1;
    private int diem;
    private String xl;

    public ThiSinh(String ten, String ns, double lt, double th) {
        this.ma = String.format("PH%02d",cnt++);
        ten = ten.toLowerCase().trim();
        String[] s1 = ten.split("\\s+");
        this.ten = "";
        for(String i:s1){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
        }
        this.t = 2021 - Integer.parseInt(ns.substring(ns.length()-4));

        double s = 0;
        if(lt>=8 && th>=8) s= (th+lt)/2+1;
        else if(lt>=7.5 && th>=7.5) s = (th+lt)/2+0.5;
        else s = (th+lt)/2;
        if(s>10) s = 10;
        this.diem = (int) Math.round(s);

        if(this.diem==9 || this.diem==10) this.xl = "Xuat sac";
        else if(this.diem==8) this.xl = "Gioi";
        else if(this.diem==7) this.xl = "Kha";
        else if(this.diem>=5 && this.diem<=6) this.xl = "Trung binh";
        else  this.xl = "Truot";
    }

    @Override
    public String toString() {
        return ma + " " + ten.trim() + " " + t + " " + diem + " " + xl;
    }
}
