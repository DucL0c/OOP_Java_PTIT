package j08021_dayngoacdungdainhat;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int ans = -1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(') st.push(i);
                else{
                    st.pop();
                    if(st.isEmpty()) st.push(i);
                    else{
                        int x = st.pop();
                        ans = Math.max(ans,i-x);
                        st.push(x);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
