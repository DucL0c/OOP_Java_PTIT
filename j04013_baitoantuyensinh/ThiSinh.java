package j04013_baitoantuyensinh;

public class ThiSinh {
    private String maThiSinh,hoTen,ketQua;
    private double diemToan,diemLy,diemHoa,diemUuTien,tongDiem;

    public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.tongDiem = diemHoa+diemToan*2+diemLy;

        String tmp = maThiSinh.substring(0,3);
        if(tmp.equals("KV1")) this.diemUuTien = 0.5;
        else if(tmp.equals("KV2")) this.diemUuTien = 1.0;
        else if(tmp.equals("KV3")) this.diemUuTien = 2.5;

        if((tongDiem+diemUuTien)>=24)
            this.ketQua = "TRUNG TUYEN";
        else
            this.ketQua = "TRUOT";
    }
    public String toString()
    {
        String res = String.format("%s %s ", this.maThiSinh, this.hoTen);
        if (this.diemUuTien == (int) this.diemUuTien)
            res += String.format("%.0f ", this.diemUuTien);
        else
            res += String.format("%.1f ", this.diemUuTien);
        if (this.tongDiem == (int) this.tongDiem)
            res += String.format("%.0f ", this.tongDiem);
        else
            res += String.format("%.1f ", this.tongDiem);
        res += this.ketQua;
        return res;
    }
}