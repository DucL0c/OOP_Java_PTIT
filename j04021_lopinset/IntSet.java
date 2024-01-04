package j04021_lopinset;

import java.util.TreeSet;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public IntSet union(IntSet b){
        TreeSet<Integer> s = new TreeSet<>();
        for(int i:a){
            s.add(i);
        }
        for(int i:b.getA()){
            s.add(i);
        }
        int[] c = new int[s.size()];
        int j = 0;
        for(int i:s){
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
