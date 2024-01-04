package j05007_sapxepdanhsachdoituongnhanvien;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String maNV,tenNV,gt,dc,mst,nkh;
    private Date ns;

    public NhanVien(String maNV, String tenNV, String gt, Date ns, String dc, String mst, String nkh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkh = nkh;
    }

    public Date getNs() {
        return ns;
    }

    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return maNV+" "+tenNV+" "+gt+" "+sd.format(ns)+" "+dc+" "+mst+" "+nkh;
    }
}
