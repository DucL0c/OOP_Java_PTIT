package j07010_danhsachsinhvientrongfile2;

public class SinhVien {
    private String ma,ten,lop,ns;
    private float gpa;

    public SinhVien(String ma, String ten, String lop, String ns, float gpa) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns = solvens(ns);
        this.gpa = gpa;
    }
    public String solvens(String ns){
        if(ns.charAt(2)!='/') ns = '0' + ns;
        if(ns.charAt(5)!='/') ns = ns.substring(0,3) + '0' + ns.substring(3,ns.length());
        return ns;
    }
    public String toString(){
        return ma+" "+ten+" "+lop+" "+ns+" "+ String.format("%.2f",gpa);
    }
}
