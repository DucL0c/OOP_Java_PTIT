package j07050_sapxepmathang;

public class MatHang implements Comparable<MatHang> {
    private String ma,ten,gr;
    private float ln;

    public MatHang(String ma, String ten, String gr, float ln) {
        this.ma = ma;
        this.ten = ten;
        this.gr = gr;
        this.ln = ln;
    }

    @Override
    public int compareTo(MatHang o) {
        return Float.compare(o.ln,this.ln);
    }

    public String toString(){
        return ma+" "+ten+" "+gr+" "+String.format("%.2f",ln);
    }

}
