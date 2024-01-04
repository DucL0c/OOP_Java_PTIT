package j07048_danhsachsanpham2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String maSP = sc.nextLine();
            String tenSP = sc.nextLine();
            int giaBan = Integer.parseInt(sc.nextLine());
            int baoHanh = Integer.parseInt(sc.nextLine());
            l.add(new SanPham(maSP,tenSP,giaBan,baoHanh));
        }
        Collections.sort(l);
        for(SanPham i:l){
            System.out.println(i);
        }
    }
}