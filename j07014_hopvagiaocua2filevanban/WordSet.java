package j07014_hopvagiaocua2filevanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private ArrayList<String> l = new ArrayList<>();
    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().toLowerCase().split("\\s+");
            for(String i:tmp){
                l.add(i);
            }
        }
    }
    public String union(WordSet b){
        TreeSet<String> uni = new TreeSet<>();
        for(String i:this.l){
            uni.add(i);
        }
        for(String i:b.l){
            uni.add(i);
        }
        String s="";
        for(String i:uni){
            s += i+" ";
        }
        return s.trim();
    }
    public String intersection(WordSet b){
        TreeSet<String> ins = new TreeSet<>();
        String s="";
        for(String i:this.l){
            ins.add(i);
        }
        for(String i:b.l){
            if(ins.contains(i)){
                s += i+" ";
            }
        }
        return s.trim();
    }
}