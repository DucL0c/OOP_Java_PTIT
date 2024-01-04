package j05033_sapxepthoigian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThoiGian implements Comparable<ThoiGian>{
    private int gio, phut, giay;
    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    @Override
    public int compareTo(ThoiGian o) {
        if(o.gio == this.gio){
            if(o.phut==this.phut){
                return Integer.compare(this.giay,o.giay);
            }
            return Integer.compare(this.phut,o.phut);
        }
        return Integer.compare(this.gio,o.gio);
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThoiGian> l = new ArrayList<>();
        while(t-->0){
            l.add(new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(l);
        for(ThoiGian i:l){
            System.out.println(i);
        }
    }
}
