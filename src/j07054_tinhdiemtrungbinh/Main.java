package j07054_tinhdiemtrungbinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(new SinhVien(sc.nextLine(), Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        l.get(0).setXh(1);
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i).getTb()==(l.get(i - 1).getTb())) {
                l.get(i).setXh(l.get(i - 1).getXh());
            } else {
                l.get(i).setXh(i + 1);
            }
        }
        for (SinhVien i : l) {
            System.out.println(i);
        }
    }
}