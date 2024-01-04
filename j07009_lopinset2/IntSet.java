package j07009_lopinset2;

import java.util.ArrayList;
import java.util.TreeSet;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public IntSet intersection(IntSet b){
        TreeSet<Integer> s1 = new TreeSet<>();
        TreeSet<Integer> s2 = new TreeSet<>();
        for(int i:a){
            s1.add(i);
        }
        for(int i:b.getA()){
            s2.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i:s2){
            if(s1.contains(i)){
                l.add(i);
            }
        }
        int[] c = new int[l.size()];
        int j=0;
        for(Integer i:l){
            c[j] = i;
            j+=1;
        }
        return new IntSet(c);
    }

    @Override
    public String toString() {
        String res = "";
        for(int i:a){
            res += i+" ";
        }
        return res.trim();
    }
}
