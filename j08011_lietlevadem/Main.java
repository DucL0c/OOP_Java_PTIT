package j08011_lietlevadem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static boolean check(String x){
        for(int i=1;i<x.length();i++)
            if((int)x.charAt(i) < (int)x.charAt(i-1))
                return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        LinkedHashMap<String,Integer> m = new LinkedHashMap<>();
        while(sc.hasNext()){
            String x = sc.next();
            if(check(x)){
                if(!m.containsKey(x))
                    m.put(x,1);
                else
                    m.put(x,m.get(x)+1);
            }
        }
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        m.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        sortedMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
