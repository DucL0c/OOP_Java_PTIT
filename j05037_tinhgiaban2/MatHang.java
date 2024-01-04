package j05037_tinhgiaban2;

public class MatHang implements Comparable<MatHang>{
    private String ma,ten,dvt;
    private double pvc,tt,gb;
    private static int cnt = 1;

    public MatHang(String ten, String dvt, double dgn, double sl) {
        this.ma = String.format("MH%02d",cnt++);
        this.ten = ten;
        this.dvt = dvt;
        this.pvc = dgn*sl*5/100;
        this.tt = dgn*sl + pvc;
        this.gb = Math.ceil((tt + tt*2/100)/sl/100.0)*100.0;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' +  dvt + ' ' +
                String.format("%.0f %.0f %.0f",pvc,tt,gb);
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.gb,this.gb);
    }
}
