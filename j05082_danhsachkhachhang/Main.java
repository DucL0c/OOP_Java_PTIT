package j05082_danhsachkhachhang;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> l = new ArrayList<>();
        while(n-->0){
            l.add(new KhachHang(sc.nextLine().trim(),sc.nextLine(),sc.nextLine(),
                    sc.nextLine()));
        }
        Collections.sort(l);
        for(KhachHang i:l){
            System.out.println(i);
        }
    }
 }