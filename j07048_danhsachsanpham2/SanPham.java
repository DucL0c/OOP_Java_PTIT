package j07048_danhsachsanpham2;

public class SanPham implements Comparable<SanPham>{
    private String maSP,tenSP;
    private int giaBan,baoHanh;

    public SanPham(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(o.giaBan==this.giaBan){
            return this.maSP.compareTo(o.maSP);
        }
        else{
            return Integer.compare(o.giaBan,this.giaBan);
        }
    }

    public String toString(){
        return maSP+" "+tenSP+" "+giaBan+" "+baoHanh;
    }

}
