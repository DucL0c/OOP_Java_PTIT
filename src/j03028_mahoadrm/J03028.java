package j03028_mahoadrm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J03028 {
    public static int tong(String a){
        int sum = 0;
        for(int i=0;i<a.length();i++){
            sum += a.charAt(i) - (int)'A';
        }
        return sum;
    }
    public static String convert(String a,int sum){
        String s="";
        for(int i=0;i<a.length();i++){
            s += (char) ((a.charAt(i)-(int)'A' + sum)%26+ (int)'A');
        }
        return s;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s = sc.nextLine();
            int len = (int)s.length()/2;
            String a = s.substring(0,len);
            String b = s.substring(len,s.length());
            int sum_a = tong(a);
            int sum_b = tong(b);
            String s1 = convert(a,sum_a);
            String s2 = convert(b,sum_b);
            String ans = "";
            for(int i=0;i<s1.length();i++){
                ans += (char) ((s1.charAt(i)-(int)'A' + s2.charAt(i)-(int)'A')%26+ (int)'A');
            }
            System.out.println(ans);
        }
    }
}
