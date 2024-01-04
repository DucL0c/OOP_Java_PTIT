package j05014_tuyengiaovien;

public class GiaoVien implements Comparable<GiaoVien> {
    private String maGV,tenGV,monHoc;
    private double tongDiem;
    private String ketQua;
    public static int cnt=1;
    public GiaoVien(String tenGV, String maXT,double diemTin,double diemChuyen) {
        this.maGV = String.format("GV%02d",cnt++);
        this.tenGV = tenGV;

        if(maXT.charAt(0)=='A') this.monHoc = "TOAN";
        else if(maXT.charAt(0)=='B') this.monHoc = "LY";
        else if(maXT.charAt(0)=='C') this.monHoc = "HOA";

        this.tongDiem = diemTin*2+diemChuyen;
        if(maXT.charAt(1)=='1') this.tongDiem += 2.0;
        else if(maXT.charAt(1)=='2') this.tongDiem += 1.5;
        else if(maXT.charAt(1)=='3') this.tongDiem += 1.0;
        else if(maXT.charAt(1)=='4') this.tongDiem += 0.0;

        if(this.tongDiem>=18) this.ketQua = "TRUNG TUYEN";
        else this.ketQua = "LOAI";
    }

    @Override
    public String toString() {
        return maGV+" "+tenGV+" "+monHoc+" "+String.format("%.1f",tongDiem)+" "+ketQua;
    }

    @Override
    public int compareTo(GiaoVien o) {
        if(this.tongDiem==o.tongDiem){
            return this.maGV.compareTo(o.maGV);
        }
        return Double.compare(o.tongDiem,this.tongDiem);
    }
}
