package j07055_xeploai;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten;
    private double tb;
    private String xl;
    private static int cnt = 1;

    public SinhVien(String ten, int d1, int d2, int d3) {
        this.ma = String.format("SV%02d",cnt++);
        ten = ten.toLowerCase().trim();
        String[] s = ten.split("\\s+");
        this.ten = "";
        for(String i:s){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
        }
        this.tb = (double)(d1*0.25 + d2*0.35 + d3*0.4);
        if(tb>=8) this.xl = "GIOI";
        else if(tb>=6.5 && tb<8) this.xl = "KHA";
        else if(tb>=5 && tb<6.5) this.xl = "TRUNG BINH";
        else this.xl = "KEM";
    }

    @Override
    public String toString() {
        return ma + " " + ten.trim() + " " + String.format("%.2f",tb) + " " + xl;
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.tb,this.tb);
    }
}
