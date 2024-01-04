package j05005_danhsachdoituongsinhvien3;

public class SinhVien {
    private String maSV,tenSV,ngaySinh,lopSV;
    private double gpa;
    public SinhVien() {
        this.maSV = "";
        this.tenSV = "";
        this.ngaySinh = "";
        this.lopSV = "";
        this.gpa = 0;
    }
    public SinhVien(String maSV, String tenSV, String lopSV, String ngaySinh, double gpa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.lopSV = lopSV;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString(){
        return maSV+" "+tenSV+" "+lopSV+" "+ngaySinh+" "+String.format("%.2f",gpa);
    }
}
