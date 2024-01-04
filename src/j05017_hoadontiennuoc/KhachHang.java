package j05017_hoadontiennuoc;

public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten;
    private double tongTien;
    private static int cnt=1;

    public KhachHang(String ten, double chiSoCu,double chiSoMoi) {
        this.ma = String.format("KH%02d",cnt++);
        this.ten = ten;
        double chiSo = chiSoMoi-chiSoCu;
        if(chiSo<=50){
            this.tongTien = chiSo*100*1.02;
        }
        else if(chiSo>50 && chiSo<=100){
            this.tongTien = (50*100 + (chiSo-50)*150)*1.03;
        }
        else{
            this.tongTien = (50*100 + 50*150 + (chiSo-100)*200)*1.05;
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + Math.round(tongTien);
    }

    @Override
    public int compareTo(KhachHang o) {
        return Double.compare(o.tongTien,this.tongTien);
    }
}
