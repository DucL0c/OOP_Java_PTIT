package j05060_ketquaxettuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiTuyen> l = new ArrayList<>();
        while(n-->0){
            l.add(new ThiTuyen(sc.nextLine(),sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(l);
        for(ThiTuyen i:l){
            System.out.println(i);
        }
    }
}