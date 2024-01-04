package j04014_tinhtoanphanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Phanso a = new Phanso(sc.nextLong(),sc.nextLong());
            Phanso b = new Phanso(sc.nextLong(),sc.nextLong());
            Phanso c = a.tong(b);
            System.out.print(c+" ");
            a.tich(b,c);
            System.out.println(a);
        }

    }
}
//class Phanso {
//    private long tu,mau;
//    public Phanso(){}
//    public Phanso(long tu, long mau) {
//        this.tu = tu;
//        this.mau = mau;
//    }
//    public static long gcd(long a,long b){
//        if(b==0) return  a;
//        return gcd(b,a%b);
//    }
//    public static long lcm(long a,long b){
//        return (a*b)/gcd(a,b);
//    }
//    public Phanso tong(Phanso b){
//        Phanso tmp = new Phanso(0,0);
//        long c = lcm(this.mau,b.mau);
//        long TU = this.tu*(c/this.mau)+b.tu*(c/b.mau);
//        long MAU = c;
//        TU = TU*TU;
//        MAU = MAU*MAU;
//        long d = gcd(TU,MAU);
//        TU = TU/d;
//        MAU = MAU/d;
//        tmp.tu = TU;
//        tmp.mau = MAU;
//        return tmp;
//    }
//    public void tich(Phanso b,Phanso c){
//        long TU = this.tu*b.tu*c.tu;
//        long MAU = this.mau*b.mau*c.mau;
//        long d = gcd(TU,MAU);
//        TU = TU/d;
//        MAU = MAU/d;
//        this.tu = TU;
//        this.mau = MAU;
//    }
//    public String toString(){
//        return this.tu + "/"  + this.mau;
//    }
//}