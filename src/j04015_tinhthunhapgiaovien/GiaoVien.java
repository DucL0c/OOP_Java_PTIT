package j04015_tinhthunhapgiaovien;

public class GiaoVien {
    private String chucVu,heSoLuong,tenGV;
    private int luongCoBan,phucap;

    public GiaoVien(String chucVu, String heSoLuong, String tenGV, int luongCoBan) {
        this.chucVu = chucVu;
        if(chucVu.equals("HT")) this.phucap = 2000000;
        else if(chucVu.equals("HP")) this.phucap = 900000;
        else if(chucVu.equals("GV")) this.phucap = 500000;
        this.heSoLuong = heSoLuong;
        this.tenGV = tenGV;
        this.luongCoBan = luongCoBan;
    }
    public String toString(){
        return chucVu+heSoLuong+" "+tenGV+" "+Integer.parseInt(heSoLuong)+" "
                +phucap+" "+(luongCoBan*Integer.parseInt(heSoLuong)+phucap);
    }
}
