package j05070_conglacbobongda2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList<TranDau> a = new ArrayList<>();
        while(n-->0){
            String mat = sc.next();
            int snx = Integer.parseInt(sc.next());
            for(DoiBong i:l){
                if(i.getMa().equals(mat.substring(1,3))){
                    a.add(new TranDau(mat,i.getTen(),i.getGv()*snx));
                }
            }
        }
        Collections.sort(a);
        for(TranDau i:a){
            System.out.println(i);
        }
    }
}
