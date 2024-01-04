package j04022_wordset;

import java.util.TreeSet;

public class WordSet {
    private String[] s;

    public WordSet(String tmp) {
        this.s = tmp.toLowerCase().split("\\s+");
    }

    public String[] getS() {
        return s;
    }

    public String union(WordSet b){
        TreeSet<String> ts = new TreeSet<>();
        for(String i:s){
            ts.add(i);
        }
        for(String i:b.getS()){
            ts.add(i);
        }
        String res ="";
        for(String i:ts){
            res+=i+" ";
        }
        return res.trim();
    }
    public String intersection(WordSet b){
        TreeSet<String> ts = new TreeSet<>();
        TreeSet<String> ts1 = new TreeSet<>();
        String res ="";
        for(String i:s){
            ts.add(i);
        }
        for(String i:b.getS()){
            if(ts.contains(i)){
                ts1.add(i);
            }
        }
        for(String i:ts1){
            res+=i+" ";
        }
        return res.trim();
    }
}
