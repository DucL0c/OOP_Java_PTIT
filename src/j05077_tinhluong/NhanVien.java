package j05077_tinhluong;

public class NhanVien {
    private String ma,ten,phong;
    private int lg;

    public NhanVien(String ma, String ten, String phong, int lg) {
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.lg = lg;
    }

    @Override
    public String toString() {
        return ma +" "+ ten +" "+ phong.trim() +" "+ lg;
    }
}
