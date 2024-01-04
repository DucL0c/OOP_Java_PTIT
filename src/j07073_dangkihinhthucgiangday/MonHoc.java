package j07073_dangkihinhthucgiangday;

public class MonHoc implements Comparable<MonHoc>{
    private String ma,ten,lt,th;
    private int stc;

    public MonHoc(String ma, String ten, int stc, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
        this.lt = lt;
        this.th = th;
    }

    public String getTh() {
        return th;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + stc + ' ' + lt + ' ' + th;
    }
}
