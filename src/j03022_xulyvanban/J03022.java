package j03022_xulyvanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        ArrayList<String> l = new ArrayList<>();
        while(sc.hasNext()){
            l.add(sc.next().toLowerCase());
        }
        String vanBan = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            vanBan += " " + l.get(i);
        }
        String[] cau = vanBan.split("[.!?]");
        for (int i = 0; i < cau.length; i++) {
            String temp = cau[i].trim();
            System.out.println(temp.substring(0,1).toUpperCase() + temp.substring(1,temp.length()));
        }
    }
}
