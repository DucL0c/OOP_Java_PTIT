package j03029_chuanhoacau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().trim().toLowerCase().split("\\s+");
            String ans = tmp[0].substring(0,1).toUpperCase()+tmp[0].substring(1)+" ";
            for(int i=1;i<tmp.length-1;i++){
                ans += tmp[i]+" ";
            }
            ans = ans.trim();
            if(tmp[tmp.length-1].equals(".")||tmp[tmp.length-1].equals("!")||tmp[tmp.length-1].equals("?")){
                ans += tmp[tmp.length-1];
            }
            else{
                String x = tmp[tmp.length-1];
                if(x.charAt(x.length()-1)=='.' || x.charAt(x.length()-1)=='?' || x.charAt(x.length()-1)=='!')
                    ans += " " + x;
                else
                    ans += " " + x+".";
            }
            System.out.println(ans);
        }
    }
}
