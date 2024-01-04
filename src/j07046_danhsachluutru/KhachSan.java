package j07046_danhsachluutru;

public class KhachSan {
    private String maKH,tenKH,maP;
    private int soN;

    public KhachSan(String maKH, String tenKH, String maP, int soN) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maP = maP;
        this.soN = soN;
    }

    public int getSoN() {
        return soN;
    }

    public String toString(){
        return maKH+" "+tenKH+" "+maP+" "+soN;
    }
}
