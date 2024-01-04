package j07013_danhsachsinhvientrongfilenhiphan;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien implements Serializable {
    private String ma,ten,lop;
    private Date ngaySinh;
    private Double gpa;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVien(int id,String ten, String lop, String ngaySinh, Double gpa){
        this.ma = String.format("B20DCCN%03d",id+1);
        this.ten = ten;
        this.lop = lop;
        try{
            this.ngaySinh = (Date) sd.parse(ngaySinh);
        } catch (ParseException e) {

        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+sd.format(ngaySinh)+" "+String.format("%.2f",gpa);
    }
}
