package j07057_diemtuyensinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> l = new ArrayList<>();
        while (n-- > 0) {
            l.add(new ThiSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l);
        for(ThiSinh i:l){
            System.out.println(i);
        }
    }
}