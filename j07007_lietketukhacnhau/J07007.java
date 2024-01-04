package j07007_lietketukhacnhau;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class WordSet {
        private Set<String> st = new TreeSet<>();
        public WordSet(String s) throws IOException{
            Scanner sc = new Scanner(new File(s));
            while(sc.hasNext()){
                st.add(sc.next().toLowerCase());
            }
        }
        public String toString(){
            String res = "";
            for(String i:st){
                res += i +"\n";
            }
            return res;
        }

}
public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws.toString());
    }
}
