package j07018_chuanhoadanhsachsinhvien;

public class SinhVien {
    private String ma,ten,lop,ngaySinh;
    private double gpa;
    private static int cnt = 1;

    public SinhVien(String ten, String lop, String ngaySinh, double gpa) {
        this.ma = String.format("B20DCCN%03d",cnt++);
        this.ten = "";
        String[] tmp = ten.toLowerCase().trim().split("\\s+");
        for(String i:tmp){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        this.lop = lop;
        if(ngaySinh.charAt(2)!='/') ngaySinh = '0'+ngaySinh;
        if(ngaySinh.charAt(5)!='/') ngaySinh = ngaySinh.substring(0,3)+"0"+ngaySinh.substring(3);
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma+" "+ten.trim()+" "+lop+" "+ngaySinh+" "+String.format("%.2f",gpa);
    }
}
