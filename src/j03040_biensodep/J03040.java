package j03040_biensodep;

import java.util.Scanner;

public class J03040 {
    public static boolean tang_chat(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)-'0'>=s.charAt(i+1)-'0'){
                return false;
            }
        }
        return true;
    }
    public static boolean bang_nhau(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)-'0'!=s.charAt(i+1)-'0'){
                return false;
            }
        }
        return true;
    }
    public static boolean daub_cuoib(String s){
        for(int i=0;i<2;i++){
            if(s.charAt(i)-'0'!=s.charAt(i+1)-'0'){
                return false;
            }
        }
        if(s.charAt(3)-'0'!=s.charAt(4)-'0')
            return false;
        return true;
    }
    public static boolean loc_phat(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='8' && s.charAt(i)!='6'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            String tmp = s.substring(n-6,n-3)  + s.substring(n-2,n);
            int d = 0;
            if(tang_chat(tmp)==true) d = 1;
            else if(bang_nhau(tmp)==true) d = 1;
            else if(daub_cuoib(tmp)==true) d = 1;
            else if(loc_phat(tmp)==true) d = 1;
            if(d==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
