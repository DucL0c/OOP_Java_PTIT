package j07072_chuanhoavasapxep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DANHSACH.in"));
        ArrayList<String> l = new ArrayList<>();
        while(sc.hasNextLine()){
            String ten = sc.nextLine().trim().toLowerCase();
            String[] s = ten.split("\\s+");
            String ans = "";
            for(String i:s){
                ans += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
            }
            l.add(ans.trim());
        }
        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split("\\s+");
                String[] s2 = o2.split("\\s+");
                if(s1[s1.length-1].equals(s2[s2.length-1])){
                    if(s1[0].equals(s2[0])){
                        String tmp1 = "";
                        String tmp2 = "";
                        for(int i=1;i< s1.length-1;i++) tmp1 += s1[i]+" ";
                        for(int i=1;i< s2.length-1;i++) tmp2 += s2[i]+" ";
                        return tmp1.compareTo(tmp2);
                    }
                    else{
                        return s1[0].compareTo(s2[0]);
                    }
                }
                else{
                    return s1[s1.length-1].compareTo(s2[s2.length-1]);
                }
            }
        });
        for(String i:l){
            System.out.println(i);
        }
    }
}
