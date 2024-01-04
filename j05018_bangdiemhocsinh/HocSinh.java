package j05018_bangdiemhocsinh;


public class HocSinh implements Comparable<HocSinh>{
    private String ma,ten,xl;
    private double tb;
    private static int cnt=1;

    public HocSinh(String ten, String tmp) {
        this.ma = String.format("HS%02d",cnt++);
        this.ten = ten;
        String[] s = tmp.split("\\s+");
        double sum = Double.parseDouble(s[0])*2 + Double.parseDouble(s[1])*2;
        for(int i = 2;i<s.length;i++){
            sum += Double.parseDouble(s[i]);
        }
        this.tb = sum/10/1.2;
        if(tb>=9) this.xl = "XUAT SAC";
        else if(tb>=8 && tb<9) this.xl = "GIOI";
        else if(tb>=7 && tb<8) this.xl = "KHA";
        else if(tb>=5 && tb<7) this.xl = "TB";
        else this.xl = "YEU";
    }

    @Override
    public int compareTo(HocSinh o) {
        if(o.tb == this.tb){
            return this.ma.compareTo(o.ma);
        }
        return Double.compare(o.tb,this.tb);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + String.format("%.1f",tb) + ' ' + xl ;
    }
}
