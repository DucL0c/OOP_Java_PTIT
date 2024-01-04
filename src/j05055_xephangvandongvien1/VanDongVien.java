package j05055_xephangvandongvien1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VanDongVien {
    private String ma,ten;
    private Date tt,ut,ttt;
    private int xh;
    private static int cnt=1;
    private SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");

    public VanDongVien(String ten, String ns, String xp, String dd) throws ParseException {
        this.ma = String.format("VDV%02d",cnt++);
        this.ten = ten;
        this.tt = tt;
        this.ut = ut;
        this.ttt = ttt;
        this.xh = xh;
    }
}
