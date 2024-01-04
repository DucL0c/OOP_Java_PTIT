package j08012_hinhsao;

import java.util.ArrayList;
import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<=n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            l.get(x).add(y);
            l.get(y).add(x);
        }
        int d = 0;
        for(int i=1;i<=n;i++){
            if(l.get(i).size()==n-1){
                d = 1;
                break;
            }
        }
        if(d==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
