package j05031_bangdiemthanhphan2;

public class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,lop;
    private double d1,d2,d3;

    public SinhVien(String ma, String ten, String lop, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + lop + ' ' + String.format("%.1f",d1)
                + " " + String.format("%.1f",d2) + " " + String.format("%.1f",d3);
    }
}
