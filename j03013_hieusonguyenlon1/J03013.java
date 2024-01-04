package j03013_hieusonguyenlon1;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            int n = Math.max(s1.length(),s2.length());
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            String c = String.valueOf(a.subtract(b).abs());
            while(c.length()<n){
                c = '0' + c;
            }
            System.out.println(c);
        }
    }
}
