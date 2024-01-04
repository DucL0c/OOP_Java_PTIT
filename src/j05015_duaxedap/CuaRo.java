package j05015_duaxedap;

public class CuaRo implements Comparable<CuaRo>{
    private String ma,ten,donVi;
    private double vanToc;

    public CuaRo(String ten, String donVi, String thoiGian) {
        String[] s = (donVi+" "+ten).toUpperCase().split("\\s+");
        this.ma = "";
        for(String i:s){
            ma += i.substring(0,1);
        }
        this.ten = ten;
        this.donVi = donVi;

        if(thoiGian.length()==4) thoiGian = '0'+thoiGian;
        int phut = Integer.parseInt(thoiGian.substring(3));
        int gio = Integer.parseInt(thoiGian.substring(0,2))-6;
        double tg = (double) gio + (double)phut/60;
        this.vanToc = (double)120/tg;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + Math.round(vanToc) +" Km/h";
    }

    @Override
    public int compareTo(CuaRo o) {
        return Double.compare(o.vanToc,this.vanToc);
    }
}
