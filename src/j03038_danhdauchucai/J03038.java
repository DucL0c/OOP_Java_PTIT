package j03038_danhdauchucai;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> st = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        System.out.println(st.size());
    }
}
