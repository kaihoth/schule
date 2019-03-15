package Methoden;

public class uebung6 {
    public static void main(String[] args) {
        int exp = 2, zahl = 2;
        System.out.println(zahl+"^"+exp+" = "+hoch(zahl,exp));
    }

    public static int hoch(int grundzahl, int exponent){
        if(exponent <= 0){
            return 1;
        }
        return (int) Math.pow(grundzahl,exponent);
    }
}
