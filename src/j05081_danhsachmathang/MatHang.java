package j05081_danhsachmathang;

public class MatHang implements Comparable<MatHang>{
    private String ma,ten,dv;
    private int gm,gb,ln;

    public MatHang(String ma, String ten, String dv, int gm, int gb) {
        this.ma = ma;
        this.ten = ten;
        this.dv = dv;
        this.gm = gm;
        this.gb = gb;
        this.ln = gb-gm;
    }
    public String toString(){
        return ma+" "+ten+" "+dv+" "+gm+" "+gb+" "+ln;
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.ln==o.ln){
            return (this.ma).compareTo(o.ma);
        }
        return Integer.compare(o.ln,this.ln);
    }
}
