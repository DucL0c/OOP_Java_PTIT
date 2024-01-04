package j05080_lophocphan2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Lop> l = new ArrayList<>();
        while(n-->0){
            l.add(new Lop(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ten = sc.nextLine();
            for(Lop i:l){
                if(i.getTengv().equals(ten)){
                    System.out.printf("Danh sach cho giang vien %s:\n",i.getTengv());
                    break;
                }
            }
            for(Lop i:l){
                if(i.getTengv().equals(ten)){
                    System.out.println(i);
                }
            }
        }
    }
}