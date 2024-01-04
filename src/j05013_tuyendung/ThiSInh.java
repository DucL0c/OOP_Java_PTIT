package j05013_tuyendung;

import java.util.Comparator;

public class ThiSInh implements Comparable<ThiSInh> {
    private String ma,ten;
    private double diemLT,diemTH,diemTb;
    private String xepLoai;
    private static int cnt = 1;
    public ThiSInh(String ten, double diemLT, double diemTH) {
        this.ma = String.format("TS%02d",cnt++);
        this.ten = ten;

        if(diemLT>10) this.diemLT = diemLT/10;
        else this.diemLT = diemLT;
        if(diemTH>10) this.diemTH = diemTH/10;
        else this.diemTH = diemTH;
        this.diemTb = (this.diemLT+this.diemTH)/2;

        if(this.diemTb<5) this.xepLoai = "TRUOT";
        else if(this.diemTb>=5 && this.diemTb<8) this.xepLoai = "CAN NHAC";
        else if(this.diemTb>=8 && this.diemTb<9.5) this.xepLoai = "DAT";
        else if(this.diemTb>=9.5) this.xepLoai = "XUAT SAC";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f",diemTb) + " " + xepLoai;
    }

    @Override
    public int compareTo(ThiSInh o) {
        return Double.compare(o.diemTb,this.diemTb);
    }
}
