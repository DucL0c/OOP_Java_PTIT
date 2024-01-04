package j07046_danhsachluutru;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<KhachSan> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String maKH="";
            if(i<10) maKH = "KH0" + i;
            else maKH = "KH" + i;
            String tenKH = sc.nextLine();
            String maP = sc.nextLine();
            DateTimeFormatter dt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate nd = LocalDate.parse(sc.nextLine(),dt);
            LocalDate nr = LocalDate.parse(sc.nextLine(),dt);
            int soN = (int) ChronoUnit.DAYS.between(nd,nr);
            l.add(new KhachSan(maKH,tenKH,maP,soN));
        }
        Collections.sort(l, new Comparator<KhachSan>() {
            @Override
            public int compare(KhachSan o1, KhachSan o2) {
                return Integer.compare(o2.getSoN(),o1.getSoN());
            }
        });
        for(KhachSan i:l){
            System.out.println(i);
        }
    }
}