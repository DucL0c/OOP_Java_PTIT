package j05070_conglacbobongda2;

public class TranDau implements Comparable<TranDau>{
    private String maTran,ten;
    private int dt;

    public TranDau(String maTran,String ten,int dt) {
        this.maTran = maTran;
        this.ten = ten;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return maTran + " " + ten + " " + dt ;
    }

    @Override
    public int compareTo(TranDau o) {
        if(this.dt==o.dt){
            return this.ten.compareTo(o.ten);
        }
        return Integer.compare(o.dt,this.dt);
    }
}
