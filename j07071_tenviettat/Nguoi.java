package j07071_tenviettat;

public class Nguoi implements Comparable<Nguoi>{
    private String ma,ten;

    public Nguoi(String ten) {
        String[] tmp = ten.split("\\s+");
        this.ma = "";
        for(int i=0;i<tmp.length;i++){
            if(i == tmp.length-1){
                this.ma += tmp[i].substring(0,1);
            }
            else this.ma += tmp[i].substring(0,1) + '.';
        }
        this.ten = ten;
    }

    public boolean check(String s) {
        if(ma.length()!=s.length()) return false;
        for(int i=0;i<ma.length();i++){
            if(s.charAt(i) == '*') continue;
            if(ma.charAt(i) != s.charAt(i)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ten;
    }

    @Override
    public int compareTo(Nguoi o) {
        String[] tmp1 = ten.split("\\s+");
        String[] tmp2 = o.ten.split("\\s+");
        if(tmp1[tmp1.length-1] == tmp2[tmp2.length-1]){
            return tmp1[0].compareTo(tmp2[0]);
        }
        return tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1]);
    }
}
