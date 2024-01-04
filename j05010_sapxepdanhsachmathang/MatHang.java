package j05010_sapxepdanhsachmathang;

public class MatHang implements Comparable<MatHang>{
    private String ma,ten,gr;
    private double ln;
    private static int cnt=1;

    public MatHang(String ten, String gr, double gm, double gb) {
        this.ma = String.format("%d",cnt++);
        this.ten = ten;
        this.gr = gr;
        this.ln = gb-gm;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.ln,this.ln);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + gr + ' ' + String.format("%.2f",ln);
    }
}
