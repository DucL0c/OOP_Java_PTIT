package j07058_danhsachmonthi;

public class MonHoc {
    private String maMon,tenMon,hinhThucThi;

    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }
    public String toString(){
        return maMon+" "+tenMon+" "+hinhThucThi;
    }
}
