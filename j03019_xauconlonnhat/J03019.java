package j03019_xauconlonnhat;

import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int Max = 0;
        for(int i = s.length()-1;i>=0;i--){
            if((int)(s.charAt(i))>=Max){
                ans = s.charAt(i) + ans;
                Max = (int)(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
