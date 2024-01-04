package j05020_sapxepsinhvientheolop;

public class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)){
            return this.ma.compareTo(o.ma);
        }
        return this.lop.compareTo(o.lop);
    }

    @Override
    public String toString() {
        return ma + ' ' +  ten + ' ' + lop + ' ' +  email ;
    }
}
