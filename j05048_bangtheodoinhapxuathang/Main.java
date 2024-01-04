package j05048_bangtheodoinhapxuathang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hang> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            l.add(new Hang(sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(Hang i:l){
            System.out.println(i);
        }
    }
}