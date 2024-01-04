package j07022_loaibosonguyen;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> l = new ArrayList<>();
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            List<String> a = Arrays.asList(x.split("\\s++"));
            for(String i:a){
                try{
                    int n = Integer.parseInt(i);
                }catch (NumberFormatException e){
                    l.add(i);
                }
            }
        }
        l.sort(null);
        for(String i:l){
            System.out.print(i+" ");
        }
    }
}
