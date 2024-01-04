package j07002_tinhtong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String x = sc.next();
            try{
                int n = Integer.parseInt(x);
                sum += n;
            }
            catch (NumberFormatException e){}
        }
        System.out.println(sum);
    }
}
