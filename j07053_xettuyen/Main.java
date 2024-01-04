package j07053_xettuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(new ThiSinh(sc.nextLine(), sc.nextLine(),
               Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(ThiSinh i:l){
            System.out.println(i);
        }
    }
}