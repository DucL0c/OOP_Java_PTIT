package j05006_danhsachdoituongnhanvien;

public class NhanVien {
    private String maNV,tenNV,gt,ns,dc,mst,nkh;

    public NhanVien(String maNV, String tenNV, String gt, String ns, String dc, String mst, String nkh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkh = nkh;
    }

    public String toString(){
        return maNV+" "+tenNV+" "+gt+" "+ns+" "+dc+" "+mst+" "+nkh;
    }
}