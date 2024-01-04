package j05013_tuyendung;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSInh> l = new ArrayList<>();
        while(t-->0){
            l.add(new ThiSInh(sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()) ));
        }
        Collections.sort(l);
        for(ThiSInh i:l){
            System.out.println(i);
        }
    }
}