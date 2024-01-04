package j05069_conglacbobongda1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoiBong> l = new ArrayList<>();
        while(t-->0){
            l.add(new DoiBong(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String mat = sc.next();
            int snx = Integer.parseInt(sc.next());
            for(DoiBong i:l){
                if(i.getMa().equals(mat.substring(1,3))){
                    System.out.println(new DoiBong(mat,i.getTen(),i.getGv()*snx));
                }
            }
        }
    }
}
