package j03025_xaudoixung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int dem = 0;
            for(int i=0,j=s.length()-1;i<j;i++,j--){
                if(s.charAt(i) != s.charAt(j)){
                    dem+=1;
                    if(dem==2) break;
                }
            }
            if(s.length()%2!=0 && dem<=1) System.out.println("YES");
            else if(s.length()%2==0 && dem==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
