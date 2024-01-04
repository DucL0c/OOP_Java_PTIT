package j07071_tenviettat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Nguoi> l = new ArrayList<>();
        while(n-->0){
            l.add(new Nguoi(sc.nextLine()));
        }
        Collections.sort(l);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            for(Nguoi i:l){
                if(i.check(ma)==true){
                    System.out.println(i);
                }
            }
        }
    }
}