package j03012_tongsonguyenlon;

import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        //while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            System.out.println(a.add(b));
        //}
    }
}
