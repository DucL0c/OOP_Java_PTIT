package j05079_lophocphan1;

public class Lop implements Comparable<Lop>{
    private String mal,tenl,nhom,tengv;

    public Lop(String mal, String tenl, String nhom, String tengv) {
        this.mal = mal;
        this.tenl = tenl;
        this.nhom = nhom;
        this.tengv = tengv;
    }

    public String getMal() {
        return mal;
    }

    public String getTenl() {
        return tenl;
    }

    @Override
    public String toString() {
        return nhom+" "+tengv;
    }

    @Override
    public int compareTo(Lop o) {
        return this.nhom.compareTo(o.nhom);
    }
}
