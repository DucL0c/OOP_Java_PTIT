package j05082_danhsachkhachhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten,gt;
    private Date ns;
    private String dc;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private static int cnt=1;

    public KhachHang(String ten, String gt, String ns, String dc) throws ParseException {
        this.ma = String.format("KH%03d",cnt++);
        String[] s = ten.toLowerCase().split("\\s+");
        this.ten = "";
        for(String i:s){
            this.ten += i.substring(0,1).toUpperCase() + i.substring(1,i.length()) +" ";
        }
        this.ten = this.ten.trim();
        this.gt = gt;
        this.ns = sd.parse(ns);
        this.dc = dc;
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.ns.compareTo(o.ns);
    }

    @Override
    public String toString() {
        return ma +" "+ ten +" "+ gt +" "+ dc +" "+sd.format(ns);
    }
}
