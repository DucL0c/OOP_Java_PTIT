package j05052_tracuudonhang;

public class DonHang {
    private String ten, ma, stt;
    private double gg,tt;

    public DonHang(String ten, String ma, double dg, double sl) {
        this.ten = ten;
        this.ma = ma;
        this.stt = ma.substring(1,4);
        if(ma.substring(ma.length()-1).equals("1")) this.gg = dg*sl*50/100;
        else if(ma.substring(ma.length()-1).equals("2")) this.gg = dg*sl*30/100;
        this.tt = dg*sl - this.gg;
    }

    @Override
    public String toString() {
        return ten + ' ' + ma + ' ' + stt + ' ' + String.format("%.0f %.0f",gg,tt);
    }
}
