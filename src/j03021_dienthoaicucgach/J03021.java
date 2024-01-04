package j03021_dienthoaicucgach;

import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next().toLowerCase();
            String tmp="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='b' || s.charAt(i)=='c'){
                    tmp += '2';
                }
                else if(s.charAt(i)=='d' || s.charAt(i)=='e' || s.charAt(i)=='f'){
                    tmp += '3';
                }
                else if(s.charAt(i)=='g' || s.charAt(i)=='h' || s.charAt(i)=='i'){
                    tmp += '4';
                }
                else if(s.charAt(i)=='j' || s.charAt(i)=='k' || s.charAt(i)=='l'){
                    tmp += '5';
                }
                else if(s.charAt(i)=='m' || s.charAt(i)=='n' || s.charAt(i)=='o'){
                    tmp += '6';
                }
                else if(s.charAt(i)=='p' || s.charAt(i)=='q' || s.charAt(i)=='r' || s.charAt(i)=='s'){
                    tmp += '7';
                }
                else if(s.charAt(i)=='t' || s.charAt(i)=='u' || s.charAt(i)=='v'){
                    tmp += '8';
                }
                else{
                    tmp += '9';
                }
            }
            StringBuilder st = new StringBuilder(tmp);
            if(tmp.equals(st.reverse().toString())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
