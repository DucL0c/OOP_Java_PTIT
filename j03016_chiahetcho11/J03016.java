package j03016_chiahetcho11;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            BigInteger n = new BigInteger("11");
            BigInteger a = new BigInteger(s1);
            if(a.remainder(n).equals(BigInteger.ZERO)){
                System.out.println("1");
            }
            else System.out.println("0");
        }
    }
}
