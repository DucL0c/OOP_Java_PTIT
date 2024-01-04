package j05023_lietkesinhvientheokhoa;

public class SinhVien{
    private String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop.substring(1,3);
    }

    @Override
    public String toString() {
        return ma + ' ' +  ten + ' ' + lop + ' ' +  email;
    }
}
