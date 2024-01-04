package j07017_loppair;

public class Pair<T, T1> {
    private int x,y;
    public Pair(Integer i, Integer i1) {
        this.x =  i;
        this.y =  i1;
    }
    public boolean check(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isPrime() {
        if(check(x) && check(y)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
