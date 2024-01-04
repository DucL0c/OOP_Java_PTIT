package j06004_quanlybainhom2;

public class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,sdt,maNhom,deTai;

    public SinhVien(String ma, String ten, String sdt, String maNhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.maNhom = maNhom;
    }

    public String getmaNhom() {
        return maNhom;
    }

    public void setDeTai(String deTai) {
        this.deTai = deTai;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+sdt+" "+maNhom+" "+deTai;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
}
