package j07034_danhsachmonhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<MonHoc> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            int soTC = Integer.parseInt(sc.nextLine());
            l.add(new MonHoc(maMon,tenMon,soTC));
        }
        Collections.sort(l, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTenMon().compareTo(o2.getTenMon());
            }
        });
        for(MonHoc i : l){
            System.out.println(i);
        }
    }
}