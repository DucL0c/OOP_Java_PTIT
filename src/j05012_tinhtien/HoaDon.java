package j05012_tinhtien;

public class HoaDon implements Comparable<HoaDon>{
    private String ma,ten;
    private long soLuong,donGia,chietKhau,tongTien;

    public HoaDon(String ma, String ten, long soLuong, long donGia, long chietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.tongTien = donGia*soLuong - chietKhau;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+soLuong+" "+donGia+" "+chietKhau+" "+tongTien;
    }

    @Override
    public int compareTo(HoaDon o) {
        return Double.compare(o.tongTien,this.tongTien);
    }
}
