package j05045_sapxepnhanvientheothunhap;

public class NhanVien implements Comparable<NhanVien>{
    private String ma,ten;
    private double pc,lc,tu,cl;
    private static int cnt = 1;

    public NhanVien(String ten, String cv, int lcb, int snc) {
        this.ma = String.format("NV%02d",cnt++);
        this.ten = ten;
        if(cv.equals("GD")) this.pc = 500;
        else if(cv.equals("PGD")) this.pc = 400;
        else if(cv.equals("TP")) this.pc = 300;
        else if(cv.equals("KT")) this.pc = 250;
        else this.pc = 100;

        this.lc = lcb*snc;

        if((this.lc+this.pc)*2/3 < 25000)
            this.tu = Math.round( ((this.lc+this.pc)*2/3)/1000)*1000;
        else this.tu = 25000;

        this.cl = this.lc-this.tu + this.pc ;
    }


    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + String.format("%.0f %.0f %.0f %.0f",pc,lc,tu,cl);
    }

    @Override
    public int compareTo(NhanVien o) {
        if((this.lc+this.pc)==(o.cl+o.pc)){
            return this.ma.compareTo(o.ma);
        }
        return Double.compare((o.lc+o.pc),(this.lc+this.pc));
    }
}
