package j07030_capsonguyentotrongfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class J07030 {
    public static boolean checkNT(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) sc.readObject();
        Set<Integer> s1 = new TreeSet<>();
        for(Integer i:l1)
            if(checkNT(i)==true)
                s1.add(i);

        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l2 = (ArrayList<Integer>) sc.readObject();
        Set<Integer> s2 = new TreeSet<>();
        for(Integer i:l2)
            if(checkNT(i)==true)
                s2.add(i);

        for(Integer i:s1){
            if(i>=1000000-i){
                break;
            }
            else if(s2.contains(1000000-i)){
                System.out.println(i+" "+(1000000-i));
            }
        }

        sc.close();
    }
}
