package j04004_tongphanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso(sc.nextLong(),sc.nextLong());
        Phanso b = new Phanso(sc.nextLong(),sc.nextLong());
        a.tong(b);
        System.out.println(a);
    }
}
//class Phanso {
//    private long tu,mau;
//    public Phanso(){}
//    public Phanso(long tu, long mau) {
//        this.tu = tu;
//        this.mau = mau;
//    }
//
//    public static long gcd(long a,long b){
//        if(b==0) return  a;
//        return gcd(b,a%b);
//    }
//    public static long lcm(long a,long b){
//        return (a*b)/gcd(a,b);
//    }
//    public void tong(Phanso b){
//        long c = lcm(this.mau,b.mau);
//        long TU = this.tu*(c/this.mau)+b.tu*(c/b.mau);
//        long MAU = c;
//        long d = gcd(TU,MAU);
//        TU = TU/d;
//        MAU = MAU/d;
//        this.tu = TU;
//        this.mau = MAU;
//    }
//    public String toString(){
//        return this.tu + "/"  + this.mau;
//    }
//
//}