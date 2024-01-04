package j05057_bangdiemtuyensinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> l = new ArrayList<>();
        while(t-->0){
            l.add(new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()) ));
        }
        for(ThiSinh i:l){
            System.out.println(i);
        }
    }
}
