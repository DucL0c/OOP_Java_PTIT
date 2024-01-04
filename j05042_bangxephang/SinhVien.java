package j05042_bangxephang;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private int ac,sb;

    public SinhVien(String ten, String tmp) {
        this.ten = ten;
        String[] s = tmp.split("\\s+");
        this.ac = Integer.parseInt(s[0]);
        this.sb = Integer.parseInt(s[1]);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.ac == o.ac){
            if(this.sb == o.sb){
                return this.ten.compareTo(o.ten);
            }
            return Integer.compare(this.sb,o.sb);
        }
        return Integer.compare(o.ac,this.ac);
    }

    @Override
    public String toString() {
        return ten + ' ' + ac +" " + sb;
    }
}
