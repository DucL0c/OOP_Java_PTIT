package j06003_quanlybainhom1;

public class Nhom {
    private String maNhom,detai;
    private static int cnt = 1;

    public Nhom(String detai) {
        this.maNhom = String.format("%d",cnt++);
        this.detai = detai;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getDetai() {
        return detai;
    }
}
