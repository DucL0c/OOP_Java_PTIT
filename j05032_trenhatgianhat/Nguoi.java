package j05032_trenhatgianhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private Date ns;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    public Nguoi(String tmp) throws ParseException {
        String[] s  = tmp.split("\\s+");
        this.ten = s[0];
        this.ns = sd.parse(s[1]);
    }

    @Override
    public int compareTo(Nguoi o) {
        return o.ns.compareTo(this.ns);
    }

    @Override
    public String toString() {
        return ten;
    }
}
