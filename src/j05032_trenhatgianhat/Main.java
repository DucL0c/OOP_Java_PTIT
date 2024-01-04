package j05032_trenhatgianhat;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Nguoi> l = new ArrayList<>();
        while(t-->0){
            l.add(new Nguoi(sc.nextLine()));
        }
        Collections.sort(l);
        System.out.printf("%s\n%s",l.get(0),l.get(l.size()-1));
    }
}