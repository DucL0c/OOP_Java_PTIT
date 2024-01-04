package j05036_tinhgiaban1;

public class MatHang {
    private String ma,ten,dvt;
    private double pvc,tt,gb;
    private static int cnt = 1;

    public MatHang(String ten, String dvt, double dgn, double sl) {
        this.ma = String.format("MH%02d",cnt++);
        this.ten = ten;
        this.dvt = dvt;
        this.pvc = Math.round(dgn*sl*5/100);
        this.tt = Math.round(dgn*sl + pvc);
        this.gb = tt + tt*2/100;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' +  dvt + ' ' + String.format("%.0f %.0f %.0f",pvc,tt,gb);
    }
}
