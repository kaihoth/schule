package Methoden;

public class uebung3 {
    public static void main(String[] args) {

        int zahl = 4;

        if(istPrim(zahl)){
            System.out.print(zahl + " ist eine Primzahl");
        }else {
            System.out.print(zahl + " ist keine Primzahl");
        }

    }

    public static boolean istPrim(int n){
        int i=2;
        boolean y = false;
        if(n <= 1){
            y = true;
        }else {
            while (Math.pow(i,2) <= n && !y){
                if(n%i == 0){
                    y = true;
                }

                i++;
            }
        }

        if(y){
            return false;
        }
        return true;
    }
}
