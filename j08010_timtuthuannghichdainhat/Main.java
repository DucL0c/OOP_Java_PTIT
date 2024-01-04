package j08010_timtuthuannghichdainhat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static boolean check(String x){
        String tmp;
        StringBuilder sb = new StringBuilder(x);
        tmp = sb.reverse().toString();
        if(tmp.equals(x)) return true;
        else return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> m = new LinkedHashMap<>();
        int maxString = 0;
        while(sc.hasNext()){
            String x = sc.next();
            if(check(x)){
                if(x.length()>maxString) maxString=x.length();
                if(!m.containsKey(x))
                    m.put(x,1);
                else
                    m.put(x,m.get(x)+1);
            }

        }
        int finalMaxString = maxString;
        m.forEach((i, j)->{
            if(i.length()== finalMaxString){
                System.out.println(i+" "+j);
            }
        });
    }
}
