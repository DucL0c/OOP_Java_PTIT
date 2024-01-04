package j05048_bangtheodoinhapxuathang;

public class Hang {
    private String ma;
    private double sln,slx,dg,tien,tax;

    public Hang(String ma, double sln) {
        this.ma = ma;
        this.sln = sln;

        if(ma.charAt(0)=='A') this.slx = Math.round(sln*60/100);
        else this.slx = Math.round(sln*70/100);

        if(ma.charAt(ma.length()-1)=='Y') this.dg = 110000;
        else this.dg = 135000;

        this.tien = this.slx*this.dg;

        if(ma.charAt(0)=='A' && ma.charAt(ma.length()-1)=='Y') this.tax = this.tien*8/100;
        else if(ma.charAt(0)=='A' && ma.charAt(ma.length()-1)=='N') this.tax = this.tien*11/100;
        else if(ma.charAt(0)=='B' && ma.charAt(ma.length()-1)=='Y') this.tax = this.tien*17/100;
        else if(ma.charAt(0)=='B' && ma.charAt(ma.length()-1)=='N') this.tax = this.tien*22/100;
    }

    @Override
    public String toString() {
        return ma + ' ' + String.format("%.0f %.0f %.0f %.0f %.0f",sln,slx,dg,tien,tax);
    }
}
