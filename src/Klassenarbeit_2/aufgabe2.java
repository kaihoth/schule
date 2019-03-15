package Klassenarbeit_2;

public class aufgabe2 {
    public static void main(String[] args) {
        int[] zahlenSammlung = {5, 12, 8, 9, 3, 2, 17, 20};

        for (int i = 1; i<=(zahlenSammlung.length/2);i++){
            System.out.print(zahlenSammlung[i-1]+","+zahlenSammlung[zahlenSammlung.length-i]+" ");
        }
    }
}
