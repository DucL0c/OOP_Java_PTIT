package j05007_sapxepdanhsachdoituongnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<NhanVien> l = new ArrayList<>();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        for(int i=1;i<=n;i++){
            String msv = "";
            if(i<10) msv = "0000" + i;
            else msv = "000"+i;
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            Date ns = sd.parse(sc.nextLine());
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String nkh = sc.nextLine();
            if(nkh.charAt(2)!='/') nkh = '0'+nkh;
            if(nkh.charAt(5)!='/') nkh = nkh.substring(0,3)+'0'+nkh.substring(3,nkh.length());
            NhanVien a = new NhanVien(msv,ten,gt,ns,dc,mst,nkh);
            l.add(a);

        }
        Collections.sort(l, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getNs().compareTo(o2.getNs());
            }
        });
        for(NhanVien i:l){
            System.out.println(i);
        }
    }
}