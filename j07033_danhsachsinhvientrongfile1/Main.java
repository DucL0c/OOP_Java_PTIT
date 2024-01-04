package j07033_danhsachsinhvientrongfile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> l = new ArrayList<>();
        while(n-->0){
            String maSV = sc.nextLine();
            String[] tmp = sc.nextLine().trim().toLowerCase().split("\\s+");
            String tenSV = "";
            for(String i:tmp){
                i = i.substring(0,1).toUpperCase()+i.substring(1,i.length());
                tenSV += i + " ";
            }
            String lopSV = sc.nextLine();
            String email = sc.nextLine();
            SinhVien a = new SinhVien(maSV,tenSV.trim(),lopSV,email);
            l.add(a);
        }
        Collections.sort(l, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}