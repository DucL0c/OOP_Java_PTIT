package j04006_khaibaolopsinhvien;

public class SinhVien {
    private String maSV,tenSV,lopSV,ngaySINH;
    private float gpa;
    public SinhVien() {
        this.tenSV = "";
        this.lopSV = "";
        this.ngaySINH = "";
        this.gpa = 0;
    }
    public SinhVien(String tenSV, String lopSV, String ngaySINH, float gpa) {
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.ngaySINH = ngaySINH;
        this.gpa = gpa;
    }
    public String toString(){
        return "B20DCCN001" + " " + tenSV + " " + lopSV + " " + ngaySINH + " "  +String.format("%.2f",gpa);
    }
}
