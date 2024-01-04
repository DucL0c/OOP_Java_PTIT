package j07056_tinhtiendien;

public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten;
    private int tdm,ndm,vat,tong;
    private static int cnt = 1;

    public KhachHang(String ten, String tmp) {
        this.ma = String.format("KH%02d",cnt++);
        ten = ten.trim().toLowerCase();
        String[] s = ten.split("\\s+");
        this.ten = "";
        for(String i:s){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1,i.length())+" ";
        }
        String[] x = tmp.split("\\s+");
        int sd = Integer.parseInt(x[2]) - Integer.parseInt(x[1]);
        if(x[0].equals("A")){
            if(sd<=100){
                this.tdm = sd*450;
                this.ndm = 0;
            }
            else{
                this.tdm = 100*450;
                this.ndm = (sd-100)*1000;
            }
            this.vat = (int)(0.05*this.ndm);
        }
        else if(x[0].equals("B")){
            if(sd<=500){
                this.tdm = sd*450;
                this.ndm = 0;
            }
            else{
                this.tdm = 500*450;
                this.ndm = (sd-500)*1000;
            }
            this.vat = (int)(0.05*this.ndm);
        }
        else if(x[0].equals("C")){
            if(sd<=200){
                this.tdm = sd*450;
                this.ndm = 0;
            }
            else{
                this.tdm = 200*450;
                this.ndm = (sd-200)*1000;
            }
            this.vat = (int)(0.05*this.ndm);
        }
        this.tong = this.tdm+this.ndm+this.vat;
    }

    @Override
    public String toString() {
        return  ma + ' ' + ten + ' ' + tdm + " " + ndm + " " + vat + " " + tong;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.tong,this.tong);
    }
}
