package j05080_lophocphan2;

public class Lop implements Comparable<Lop>{
    private String mal,tenl,nhom,tengv;

    public Lop(String mal, String tenl, String nhom, String tengv) {
        this.mal = mal;
        this.tenl = tenl;
        this.nhom = nhom;
        this.tengv = tengv;
    }

    public String getTengv() {
        return tengv;
    }

    @Override
    public String toString() {
        return mal+" "+tenl+" "+nhom;
    }

    @Override
    public int compareTo(Lop o) {
        if(this.mal.equals(o.mal))
            return this.nhom.compareTo(o.nhom);
        return this.mal.compareTo(o.mal);
    }
}
