package j05075_diemdanh2;

public class SinhVien {
    private String ma,ten,lop;
    private int dcc;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    public void setDcc(int dcc) {
        this.dcc = dcc;
    }

    @Override
    public String toString() {
        if(dcc<=0){
            return ma+" "+ten+" "+lop+" "+"0 KDDK";
        }
        return ma+" "+ten+" "+lop+" "+dcc;
    }
}
