package j03024_souuthe;

import java.util.Scanner;

public class J03024 {
    public static int check_chan(String s){
        int demchan = 0;
        int demle = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                return 0;
            }
            else if(((s.charAt(i) - '0') % 2) == 0){
                demchan += 1;
            }
            else{
                demle += 1;
            }
        }
        if(demchan<demle) return 2;
        return 1;
    }
    public static int check_le(String s){
        int demchan = 0;
        int demle = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                return 0;
            }
            else if(((s.charAt(i) - '0') % 2) == 0){
                demchan += 1;
            }
            else{
                demle += 1;
            }
        }
        if(demchan>demle) return 2;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(s.length()%2==0){
                if(check_chan(s)==0){
                    System.out.println("INVALID");
                }
                else if(check_chan(s)==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(check_le(s)==0){
                    System.out.println("INVALID");
                }
                else if(check_le(s)==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
