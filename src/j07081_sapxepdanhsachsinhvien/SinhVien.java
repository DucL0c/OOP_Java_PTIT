package j07081_sapxepdanhsachsinhvien;

public class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,sdt,email;

    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        String[] s1 = this.ten.split("\\s+");
        String[] s2 = o.ten.split("\\s+");
        if(s1[s1.length-1].equals(s2[s2.length-1])){
            if(s1[0].equals(s2[0])){
                String tmp1 = "";
                String tmp2 = "";
                for(int i=1;i< s1.length-1;i++) tmp1 += s1[i]+" ";
                for(int i=1;i< s2.length-1;i++) tmp2 += s2[i]+" ";
                if(tmp1.equals(tmp2)){
                    return this.ma.compareTo(o.ma);
                }
                else return tmp1.compareTo(tmp2);
            }
            else{
                return s1[0].compareTo(s2[0]);
            }
        }
        else{
            return s1[s1.length-1].compareTo(s2[s2.length-1]);
        }
    }

    @Override
    public String toString() {
        return  ma + ' ' + ten + ' ' + sdt + ' ' +email;
    }
}
