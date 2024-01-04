package j05011_tinhgio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GameThu> l = new ArrayList<>();
        while(n-->0){
            l.add(new GameThu(sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(GameThu i:l){
            System.out.println(i);
        }
    }
}