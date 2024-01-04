package j05026_danhsachgiangvientheobomon;

public class GiangVien {
    private String ma,ten,bm;
    private static int cnt = 1;

    public GiangVien(String ten, String bm) {
        this.ma = String.format("GV%02d",cnt++);
        this.ten = ten;
        String[] s = bm.toUpperCase().split("\\s+");
        this.bm = "";
        for(String i:s){
            this.bm += i.substring(0,1);
        }
    }

    public String getBm() {
        return bm;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' +  bm;
    }
}
