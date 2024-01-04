package j08022_phantudautienbenphailonhon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(sc.nextInt());
            }
            Stack<Integer> st = new Stack<>();
            for(int i=a.size()-1;i>=0;i--){
                while(!st.isEmpty() && a.get(i)>=st.peek()) st.pop();
                if(st.isEmpty()) b.add(-1);
                else b.add(st.peek());
                st.push(a.get(i));
            }
            for(int i=b.size()-1;i>=0;i--){
                System.out.print(b.get(i)+" ");
            }
            System.out.println();
        }
    }
}
