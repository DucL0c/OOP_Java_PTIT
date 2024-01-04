package j07034_danhsachmonhoc;

public class MonHoc {
    private String maMon,tenMon;
    private int soTC;

    public MonHoc(String maMon, String tenMon, int soTC) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String toString(){
        return maMon+" "+tenMon+" "+soTC;
    }
}
