package j07045_loaiphong;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String data,tenP;

    public LoaiPhong(String s) {
        String[] tmp = s.split("\\s+");
        this.data = s;
        this.tenP = tmp[1];
    }

    public String toString(){
        return data;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.tenP.compareTo(o.tenP);
    }
}
