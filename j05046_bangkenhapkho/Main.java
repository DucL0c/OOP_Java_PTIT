package j05046_bangkenhapkho;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<LoHang> l = new ArrayList<>();
        HashMap<String,Integer> m = new HashMap<>();
        while(t-->0){
            String ten = sc.nextLine();
            String[] s = ten.toUpperCase().split("\\s+");
            String ma = s[0].substring(0,1) + s[1].substring(0,1);
            if(!m.containsKey(ma)){
                m.put(ma,1);
            }
            else{
                m.put(ma, m.get(ma) + 1);
            }
            ma += String.format("%02d",m.get(ma));
            l.add(new LoHang(ma,ten,Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        for(LoHang i:l){
            System.out.println(i);
        }
    }
}