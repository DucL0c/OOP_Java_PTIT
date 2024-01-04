package j05035_danhsachthuctap2;

public class SinhVien implements Comparable<SinhVien>{
    private String stt,ma,ten,lop,email,dn;
    private static int cnt = 1;

    public SinhVien(String ma, String ten, String lop, String email, String dn) {
        this.stt = String.format("%d",cnt++);
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getDn() {
        return dn;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return stt + ' ' +  ma + ' ' + ten + ' ' + lop + ' ' + email + ' ' + dn;
    }
}
