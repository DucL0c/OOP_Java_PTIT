//package j07051_tinhtienphong;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.time.temporal.ChronoUnit;
//
//public class KhachHang implements Comparable<KhachHang> {
//    private String ma, ten, sp;
//    private int sno, tt;
//    private static int cnt = 1;
//    private int[] a = {0, 25, 34, 50, 80};
//
//    public KhachHang(String ten, String sp, String nnp, String ntp, int ps) throws ParseException {
//        this.ma = String.format("KH%02d", cnt++);
//        this.ten = chTen(ten);
//        this.sp = sp;
//        this.sno = getSno(nnp, ntp);
//        this.tt = getTt(ps);
//    }
//
//    public String chTen(String ten) {
//        String[] a = ten.toLowerCase().split("\\s+");
//        String tmp = "";
//        for (String i : a) {
//            tmp += i.substring(0, 1).toUpperCase() + i.substring(1, i.length()) + " ";
//        }
//        return tmp.trim();
//    }
//
//    public String fm(String s) {
//        if (s.charAt(2) != '/') s = '0' + s;
//        if (s.charAt(5) != '/') s = s.substring(0, 3) + '0' + s.substring(3, s.length());
//        return s;
//    }
//
//    public int getSno(String nnp, String ntp) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Date NNP = (Date) format.parse(nnp);
//        Date NTP = (Date) format.parse(ntp);
//        int soN = (int) ChronoUnit.DAYS.between(NNP.toInstant(), NTP.toInstant());
//        return soN + 1;
//    }
//
//    public int getTt(int ps) {
//        return a[this.sp.charAt(0) - '0'] * this.sno + ps;
//    }
//
//    public String toString() {
//        return ma + " " + ten + " " + sp + " " + sno + " " + tt;
//    }
//
//    @Override
//    public int compareTo(KhachHang o) {
//        return Integer.compare(o.tt, this.tt);
//    }
//}
