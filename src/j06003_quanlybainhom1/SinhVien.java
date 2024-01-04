package j06003_quanlybainhom1;

public class SinhVien {
    private String ma,ten,sdt,maNhom;

    public SinhVien(String ma, String ten, String sdt, String maNhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.maNhom = maNhom;
    }

    public String getmaNhom() {
        return maNhom;
    }

    @Override
    public String toString() {
        return ma +" "+ ten +" "+ sdt;
    }
}
