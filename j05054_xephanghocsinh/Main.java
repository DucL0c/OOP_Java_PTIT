package j05054_xephanghocsinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> l = new ArrayList<>();
        while(n-->0){
            l.add(new HocSinh(sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        ArrayList<HocSinh> a = new ArrayList<>(l);
        Collections.sort(a);
        a.get(0).setXh(1);
        for(int i=1;i<a.size();i++){
            if(a.get(i).getDtb()==a.get(i-1).getDtb()){
                a.get(i).setXh(a.get(i-1).getXh());
            }
            else{
                a.get(i).setXh(i+1);
            }
        }
        for(HocSinh i:l){
            System.out.println(i);
        }
    }
}