package j05009_timthukhoacuakithi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        double tong = 0;
        List<ThiSinh> l =  new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            ThiSinh a = new ThiSinh(i,ten,ns,d1,d2,d3);
            l.add(a);
            tong = Math.max(tong,d1+d2+d3);
        }
        for(ThiSinh i:l){
            if(i.getTong()==tong){
                System.out.println(i);
            }
        }
    }
}