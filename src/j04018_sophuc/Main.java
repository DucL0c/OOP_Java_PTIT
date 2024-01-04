package j04018_sophuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc c = a.Cong(b);
            SoPhuc d = c.Nhan(a);
            SoPhuc e = c.Nhan(c);
            System.out.println(d+", "+e);
        }
    }
}