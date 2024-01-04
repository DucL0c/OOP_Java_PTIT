package j07021_chuanhoaxauhotentrongfile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String x = sc.nextLine().toLowerCase().trim();
            String ans ="";
            if(x.equals("end")) break;
            else{
                List<String> a = Arrays.asList(x.split("\\s++"));
                for(String i:a){
                    String tmp = i.substring(0,1).toUpperCase()+i.substring(1,i.length());
                    ans += tmp+" ";
                }
                System.out.println(ans);
            }
        }
    }
}
