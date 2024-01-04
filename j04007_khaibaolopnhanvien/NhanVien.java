package j04007_khaibaolopnhanvien;

public class NhanVien {
    private String hoTen,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public String toString(){
        return "00001"+" "+hoTen+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maSoThue+" "+ngayKiHopDong;
    }
}
