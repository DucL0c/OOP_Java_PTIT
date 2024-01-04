package j05051_sapxepbangtinhtiendien;

public class KhachHang implements Comparable<KhachHang>{
    private String ma;
    private int hs;
    private double tt,pt,tong;
    private static int cnt=1;

    public KhachHang(String loai, int csc,int csm) {
        this.ma = String.format("KH%02d",cnt++);
        if(loai.equals("KD")) this.hs = 3;
        else if(loai.equals("NN")) this.hs = 5;
        else if(loai.equals("TT")) this.hs = 4;
        else if(loai.equals("CN")) this.hs = 2;

        this.tt = (csm-csc)*this.hs*550;

        if((csm-csc)<50) this.pt = 0;
        else if((csm-csc)>=50 && (csc-csm)<=100) this.pt = this.tt*35/100;
        if((csm-csc)>100) this.pt = this.tt*100/100;
        this.tong = this.tt + this.pt;
    }

    @Override
    public String toString() {
        return ma + " " + hs + " " + String.format("%.0f %.0f %.0f",tt,pt,tong);
    }

    @Override
    public int compareTo(KhachHang o) {
        return Double.compare(o.tong,this.tong);
    }
}
