package j03032_daotu;

import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split("\\s++");
            for(int i=0;i<a.length;i++){
                StringBuilder str = new StringBuilder(a[i]);
                System.out.print(str.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
