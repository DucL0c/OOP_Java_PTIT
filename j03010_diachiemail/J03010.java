package j03010_diachiemail;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> myMap = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine().toLowerCase().trim();
            String tmp="";
            String[] a = s.split("\\s++");
            tmp = a[a.length-1];
            for(int i=0;i<a.length-1;i++){
                tmp  += a[i].charAt(0);
            }

            if(myMap.containsKey(tmp)){
                myMap.put(tmp,myMap.get(tmp)+1);
                tmp += Integer.toString(myMap.get(tmp));
            }
            else{
                myMap.put(tmp,1);
            }
            System.out.println(tmp+"@ptit.edu.vn");
        }
    }
}