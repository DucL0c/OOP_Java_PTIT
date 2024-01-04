package j07073_dangkihinhthucgiangday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> l = new ArrayList<>();
        while(n-->0){
            l.add(new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),
                    sc.nextLine(),sc.nextLine() ));
        }
        Collections.sort(l);
        for(MonHoc i:l){
            if(!i.getTh().equals("Truc tiep")){
                System.out.println(i);
            }
        }
    }
}