package j03027_rutgonxaukitu;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()) st.push(s.charAt(i));
            else{
                char c = st.pop();
                if(c!=s.charAt(i)){
                    st.push(c);
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else{
            String ans = "";
            while(!st.isEmpty()){
                ans = st.pop() + ans;
            }
            System.out.println(ans);
        }

    }
}
