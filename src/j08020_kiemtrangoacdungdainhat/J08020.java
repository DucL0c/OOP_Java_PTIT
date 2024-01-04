package j08020_kiemtrangoacdungdainhat;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(st.isEmpty()){
                    st.push(s.charAt(i));
                }
                else{
                    char tmp = st.pop();
                    if(tmp=='{'){
                        if(s.charAt(i)!='}'){
                            st.push(tmp);
                            st.push(s.charAt(i));
                        }
                    }
                    else if(tmp=='['){
                        if(s.charAt(i)!=']'){
                            st.push(tmp);
                            st.push(s.charAt(i));
                        }
                    }
                    else if(tmp=='('){
                        if(s.charAt(i)!=')'){
                            st.push(tmp);
                            st.push(s.charAt(i));
                        }
                    }
                }
            }
            if(st.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}