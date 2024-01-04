package j04005_khaibaolopthisinh;

public class ThiSinh {
    private String hoTen,ngaySinh;
    private float diem1,diem2,diem3,tongDiem;
    public ThiSinh(){}

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public String toString(){
        this.tongDiem = this.diem1+this.diem2+this.diem3;
        return this.hoTen + " " + this.ngaySinh + " " +this.tongDiem;
    }
}
