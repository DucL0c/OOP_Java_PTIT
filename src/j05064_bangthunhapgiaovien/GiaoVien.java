package j05064_bangthunhapgiaovien;

public class GiaoVien {
    private String ma,ten;
    private int bl,pc,tn;

    public GiaoVien(String ma, String ten, int lcb) {
        this.ma = ma;
        this.ten = ten;
        this.bl = Integer.parseInt(ma.substring(2,4));
        if(ma.substring(0,2).equals("HT")) this.pc = 2000000;
        else if(ma.substring(0,2).equals("HP")) this.pc = 900000;
        else if(ma.substring(0,2).equals("GV")) this.pc = 500000;
        this.tn = lcb*this.bl+this.pc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bl + " " + pc + " " + tn;
    }
}
