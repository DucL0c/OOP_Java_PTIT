package j07001_docfilevanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            System.out.println(x);
        }
    }
}
