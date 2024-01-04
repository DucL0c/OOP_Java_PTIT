package j05029_danhsachdoanhnghiepnhansinhvienthuctap2;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma,ten;
    private int sl;

    public DoanhNghiep(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    public int getSl() {
        return sl;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.sl==o.sl){
            return this.ma.compareTo(o.ma);
        }
        return Integer.compare(o.sl,this.sl);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + sl;
    }
}
