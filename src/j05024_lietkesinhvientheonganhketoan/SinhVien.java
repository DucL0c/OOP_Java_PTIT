package j05024_lietkesinhvientheonganhketoan;

public class SinhVien {
    private String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        String s = ma.substring(3,7);
        if(s.equals("DCKT")) return "Ke toan";
        else if(s.equals("DCCN")) return "Cong nghe thong tin";
        else if(s.equals("DCAT")) return "An toan thong tin";
        else if(s.equals("DCVT")) return "Vien thong";
        return "Dien tu";
    }

    public String getLop() {
        return lop.substring(0,1);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + lop + ' ' + email ;
    }
}
