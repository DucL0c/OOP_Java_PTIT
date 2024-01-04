package j07004_sokhacnhautrongfile;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.IN"));
        int[] a = new int[100005];
        List<Integer> l = new ArrayList<>();
        while(sc.hasNext()){
            try{
                int n = Integer.parseInt(sc.next());
                a[n] += 1;
                l.add(n);
            }catch (NumberFormatException e){}
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            if(a[l.get(i)]!=0){
                System.out.println(l.get(i)+" "+a[l.get(i)]);
                a[l.get(i)] = 0;
            }
        }
    }
}
