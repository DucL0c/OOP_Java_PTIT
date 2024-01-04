package j07059_danhsachcathi;

public class CaThi implements Comparable<CaThi>{
    private String ma,ngay,gio,phong;
    private static int cnt = 1;

    public CaThi(String ngay, String gio,String phong) {
        this.ma = String.format("C%03d",cnt++);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    @Override
    public int compareTo(CaThi o) {
        if(this.ngay.equals(o.ngay)){
            if(this.gio.equals(o.gio)){
                return this.ma.compareTo(o.ma);
            }
            return this.gio.compareTo(o.gio);
        }
        return this.ngay.compareTo(o.ngay);
    }

    @Override
    public String toString() {
        return ma + ' ' + ngay + ' ' + gio + ' ' + phong;
    }
}
