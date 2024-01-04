package j05064_bangthunhapgiaovien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> l = new ArrayList<>();
        while(n-->0){
            l.add(new GiaoVien(sc.nextLine(),sc.nextLine(),
                    Integer.parseInt(sc.nextLine())));
        }
        int demht=0, demhp=0;
        for(GiaoVien i:l){
            if(i.getMa().substring(0,2).equals("HT")){
                if(demht<1){
                    System.out.println(i);
                    demht += 1;
                }
            }
            else if(i.getMa().substring(0,2).equals("HP")){
                if(demhp<2){
                    System.out.println(i);
                    demhp += 1;
                }
            }
            else{
                System.out.println(i);
            }

        }
    }
}