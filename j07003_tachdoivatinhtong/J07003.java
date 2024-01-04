package j07003_tachdoivatinhtong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length()>1){
            BigInteger a = new BigInteger(s.substring(0,(int)s.length()/2));
            BigInteger b = new BigInteger(s.substring((int)s.length()/2,s.length()));
            s =  String.valueOf(a.add(b));
            System.out.println(s);
        }
    }
}
