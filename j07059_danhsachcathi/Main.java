package j07059_danhsachcathi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> l = new ArrayList<>();
        while(n-->0){
            l.add(new CaThi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(CaThi i:l){
            System.out.println(i);
        }
    }
}