package j07058_danhsachmonthi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<String> l = new ArrayList<>();
        while(t-->0){
            String mamon = sc.nextLine();
            String tenmon = sc.nextLine();
            String htt = sc.nextLine();
            MonHoc a = new MonHoc(mamon,tenmon,htt);
            l.add(a.toString());
        }
        l.sort(null);
        for(String i:l){
            System.out.println(i);
        }
    }
}
//class MonHoc {
//    private String maMon,tenMon,hinhThucThi;
//
//    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
//        this.maMon = maMon;
//        this.tenMon = tenMon;
//        this.hinhThucThi = hinhThucThi;
//    }
//    public String toString(){
//        return maMon+" "+tenMon+" "+hinhThucThi;
//    }
//}
