package j02017_thugondayso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int i = 0;
        while(i<l.size()-1){
            if((l.get(i)+l.get(i+1)) % 2 == 0){
                l.remove(i);
                l.remove(i);
                i = 0;
            }
            else{
                i++;
            }
        }
        System.out.println(l.size());
    }
}
