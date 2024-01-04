package j07029_songuyentolonnhattrongfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class J07029 {
    static int[] prime = new int[1000001];
    public static void seive(){
        Arrays.fill(prime,1);
        prime[0] = prime[1] = 0;
        for(int i=2;i<=Math.sqrt(1000000);i++)
            if(prime[i]==1)
                for(int j=i*i;j<1000000;j+=i)
                    prime[j] = 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l;
        seive();
        try{
            ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
            l = (ArrayList<Integer>) sc.readObject();
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        int[] a = new int[1000001];
        for(Integer i:l){
            a[i] += prime[i];
        }
        int dem = 0;
        for(int i=1000000;i>=2;i--) {
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
                dem+=1;
                if(dem==10){
                    break;
                }
            }
        }
    }
}
