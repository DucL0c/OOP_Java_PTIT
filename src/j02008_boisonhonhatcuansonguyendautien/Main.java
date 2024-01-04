package j02008_boisonhonhatcuansonguyendautien;

import java.util.Scanner;

public class Main {
    public static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long bcnn = 1;
            for(int i=2;i<=n;i++){
                bcnn = (bcnn*i)/gcd(bcnn,i);
            }
            System.out.println(bcnn);
        }
    }
}
