package j03020_timtuthuannghichdainhat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J03020 {
    public static boolean checkTN(String s){
        StringBuilder s1 = new StringBuilder(s);
        String tmp = s1.reverse().toString();
        if(s.equals(tmp)) return true;
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split("\\s+");
            for(String i:s){
                if(checkTN(i)){
                    if(!lm.containsKey(i)){
                        lm.put(i,1);
                    }
                    else{
                        lm.put(i,lm.get(i) + 1);
                    }
                    ans = Math.max(ans,i.length());
                }
            }
        }
        int finalAns = ans;
        lm.forEach((key, value)->{
            if(key.length() == finalAns){
                System.out.println(key+" "+value);
            }
        });
    }
}
