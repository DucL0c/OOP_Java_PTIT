package j05067_quanlykhoxangdau;

public class DonHang {
    private String ma,hang;
    private double dg,tax,tt;

    public DonHang(String ma, double sl) {
        this.ma = ma;

        if(ma.substring(3,5).equals("BP")) this.hang = "British Petro";
        else if(ma.substring(3,5).equals("ES")) this.hang = "Esso";
        else if(ma.substring(3,5).equals("SH")) this.hang = "Shell";
        else if(ma.substring(3,5).equals("CA")) this.hang = "Castrol";
        else if(ma.substring(3,5).equals("MO")) this.hang = "Mobil";

        if(ma.substring(0,1).equals("X")){
            this.dg = 128000;
            this.tax = sl*this.dg*3/100;
        }
        else if(ma.substring(0,1).equals("D")){
            this.dg = 11200;
            this.tax = sl*this.dg*35/1000;
        }
        else if(ma.substring(0,1).equals("N")){
            this.dg = 9700;
            this.tax = sl*this.dg*2/100;
        }

        if(ma.substring(3,5).equals("TN")) {
            this.tax = 0;
            this.hang = "Trong Nuoc";
        }
        this.tt = sl*this.dg + this.tax;
    }

    @Override
    public String toString() {
        return ma + " " + hang + " " + String.format("%.0f %.0f %.0f",dg,tax,tt);
    }
}
