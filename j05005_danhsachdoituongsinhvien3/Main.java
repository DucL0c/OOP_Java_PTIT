package j05005_danhsachdoituongsinhvien3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SinhVien> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String msv="";
            if(i<10) {
                msv = "B20DCCN00" + i;
            }
            else{
                msv = "B20DCCN0" + i;
            }
            String ten = "";
            String[] tmp = sc.nextLine().toLowerCase().trim().split("\\s+");
            for(int j=0;j<tmp.length;j++){
                tmp[j] = tmp[j].substring(0,1).toUpperCase()+tmp[j].substring(1,tmp[j].length());
                ten += tmp[j]+" ";
            }
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            if(ngaysinh.charAt(2)!='/') ngaysinh = '0' + ngaysinh;
            if(ngaysinh.charAt(5)!='/')
                ngaysinh = ngaysinh.substring(0,3)+'0'+ngaysinh.substring(3,ngaysinh.length());
            double gpa = sc.nextDouble();
            SinhVien a = new SinhVien(msv,ten.trim(),lop,ngaysinh,gpa);
            l.add(a);
        }
        Collections.sort(l, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o2.getGpa(),o1.getGpa());
            }
        });
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}