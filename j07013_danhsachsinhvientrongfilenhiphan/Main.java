package j07013_danhsachsinhvientrongfilenhiphan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> l = (ArrayList<SinhVien>) sc.readObject();
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}