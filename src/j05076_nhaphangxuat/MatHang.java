package j05076_nhaphangxuat;

public class MatHang {
    private String ma,ten,xl;
    private double lx;

    public MatHang(String ma, String ten, String xl) {
        this.ma = ma;
        this.ten = ten;
        this.xl = xl;
        if(xl.equals("A")) this.lx = 0.08;
        else if(xl.equals("B")) this.lx = 0.05;
        else if(xl.equals("C")) this.lx = 0.02;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getLx() {
        return lx;
    }
}
