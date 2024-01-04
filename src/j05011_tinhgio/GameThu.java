package j05011_tinhgio;

public class GameThu implements Comparable<GameThu>{
    private String ma,ten;
    private int gio,phut;

    public GameThu(String ma, String ten, String gv, String gr) {
        this.ma = ma;
        this.ten = ten;
        if(Integer.parseInt(gr.substring(3,5)) >= Integer.parseInt(gv.substring(3,5))){
            this.gio = Integer.parseInt(gr.substring(0,2))-Integer.parseInt(gv.substring(0,2));
            this.phut = Integer.parseInt(gr.substring(3,5))-Integer.parseInt(gv.substring(3,5));
        }
        else{
            this.gio = Integer.parseInt(gr.substring(0,2))-Integer.parseInt(gv.substring(0,2)) - 1;
            this.phut = 60-Integer.parseInt(gv.substring(3,5)) ;
        }
    }

    @Override
    public int compareTo(GameThu o) {
        if(this.gio == o.gio){
            return Integer.compare(o.phut,this.phut);
        }
        return Integer.compare(o.gio,this.gio);
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + gio + " gio " + phut + " phut";
    }
}
