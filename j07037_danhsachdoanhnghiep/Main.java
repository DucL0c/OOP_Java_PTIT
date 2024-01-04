package j07037_danhsachdoanhnghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        List<DoanhNghiep> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String maDN = sc.nextLine();
            String tenDN = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            l.add(new DoanhNghiep(maDN,tenDN,soSV));
        }
        Collections.sort(l, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getMaDN().compareTo(o2.getMaDN());
            }
        });
        for(DoanhNghiep i:l){
            System.out.println(i);
        }
    }
}