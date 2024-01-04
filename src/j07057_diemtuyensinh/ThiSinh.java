package j07057_diemtuyensinh;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma,ten,tt;
    private double tong;
    private static int cnt=1;

    public ThiSinh(String ten, double d, String dt, String kv) {
        this.ma = String.format("TS%02d",cnt++);
        ten = ten.trim().toLowerCase();
        String[] s = ten.split("\\s+");
        this.ten = "";
        for(String i:s){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
        }
        double dc = 0;
        if(kv.equals("1")) dc += 1.5;
        else if(kv.equals("2")) dc += 1;
        if(!dt.equals("Kinh")) dc+=1.5;
        this.tong = d + dc;

        if(this.tong>=20.5) this.tt = "Do";
        else this.tt = "Truot";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tong==o.tong){
            return this.ma.compareTo(o.ma);
        }
        return Double.compare(o.tong,this.tong);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + tong + ' ' + tt;
    }
}
