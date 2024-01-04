package j07015_songuyentotrongfilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class J07015 {
    static int[] f = new int[10000];
    public static void seive() {
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for (int i = 2; i <= 100; i++)
            if (f[i] == 1)
                for (int j = i * i; j < 10000; j += i)
                    f[j] = 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l;
        seive();
        try{
            ObjectInputStream sc = new ObjectInputStream(new FileInputStream("src/DATA.in"));
            l = (ArrayList<Integer>) sc.readObject();
            sc.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        int[] a = new int[10000];
        for (Integer i : l)
            a[i] += f[i];
        for (int i = 2; i < 10000; i++)
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
    }
}
