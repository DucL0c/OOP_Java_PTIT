package j07050_sapxepmathang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =  new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ma = "";
            if(i<10) ma = "MH0"+i;
            else ma = "MH"+i;
            l.add(new MatHang(ma,sc.nextLine(), sc.nextLine(),Math.abs(Float.parseFloat(sc.nextLine())-Float.parseFloat(sc.nextLine()))));
        }
        Collections.sort(l);
        for(MatHang i:l){
            System.out.println(i);
        }
    }
}