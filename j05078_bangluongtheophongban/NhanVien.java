package j05078_bangluongtheophongban;

public class NhanVien {
    private String ma,ten,phong;
    private int lg;

    public NhanVien(String ma, String ten, String phong, int lg) {
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.lg = lg;
    }

    public String getMa() {
        return ma;
    }

    public String getPhong() {
        return phong;
    }

    @Override
    public String toString() {
        return ma +" "+ ten +" "+ lg;
    }
}
