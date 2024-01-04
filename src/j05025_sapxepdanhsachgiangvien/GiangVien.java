package j05025_sapxepdanhsachgiangvien;

public class GiangVien implements Comparable<GiangVien>{
    private String ma,ten,bm;
    private static int cnt = 1;

    public GiangVien(String ten, String bm) {
        this.ma = String.format("GV%02d",cnt++);
        this.ten = ten;
        String[] s = bm.toUpperCase().split("\\s+");
        this.bm = "";
        for(String i:s){
            this.bm += i.substring(0,1);
        }
    }

    @Override
    public int compareTo(GiangVien o) {
        String[] s1 = ten.split("\\s+");
        String[] s2 = o.ten.split("\\s+");
        if(s1[s1.length-1].equals(s2[s2.length-1])){
            return this.ma.compareTo(o.ma);
        }
        return s1[s1.length-1].compareTo(s2[s2.length-1]);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + bm;
    }
}
