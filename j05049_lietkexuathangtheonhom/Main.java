package j05049_lietkexuathangtheonhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hang> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            l.add(new Hang(sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(l);
        String x = sc.nextLine();
        for(Hang i:l){
            if(i.getMa().substring(0,1).equals(x)){
                System.out.println(i);
            }
        }
    }
}