package j03039_chiahet;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            // if a>b thi compareto tra ve 1 so duong
            // a == b thi tra ve so 0
            // a<b tra ve so am
            if(a.compareTo(b)>0){
                if(a.remainder(b).equals(BigInteger.ZERO)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(b.remainder(a).equals(BigInteger.ZERO)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
