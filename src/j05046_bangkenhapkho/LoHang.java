package j05046_bangkenhapkho;

import java.util.HashMap;

public class LoHang {
    private String ma,ten;
    private double ck,tt;
    public LoHang(String ma,String ten, int sl, int dg) {
        this.ma = ma;
        this.ten = ten;

        if(sl>10) this.ck = sl*dg*5/100;
        else if(sl>=8) this.ck = sl*dg*2/100;
        else if(sl>=5) this.ck = sl*dg*1/100;
        else this.ck = 0;
        this.tt = sl*dg - this.ck;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + String.format("%.0f %.0f",ck,tt);
    }
}
