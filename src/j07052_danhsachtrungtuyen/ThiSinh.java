package j07052_danhsachtrungtuyen;

import java.text.DecimalFormat;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma,ten,tt;
    private double ut,tong;

    public ThiSinh(String ma, String ten, double t, double l, double h) {
        this.ma = ma;
        ten = ten.toLowerCase().trim();
        String[] s = ten.split("\\s+");
        this.ten = "";
        for(String i:s){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
        }
        if(ma.substring(0,3).equals("KV1")) this.ut = 0.5;
        else if(ma.substring(0,3).equals("KV2")) this.ut = 1.0;
        else if(ma.substring(0,3).equals("KV3")) this.ut = 2.5;
        this.tong = (t*2+l+h)+this.ut;
    }

    public double getTong() {
        return tong;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return ma+" "+ten.trim()+" "+df.format(ut)+" "+df.format(tong)+" "+tt;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(o.tong == this.tong){
            return this.ma.compareTo(o.ma);
        }
        return Double.compare(o.tong,this.tong);
    }
}
