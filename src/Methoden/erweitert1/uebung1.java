package Methoden.erweitert1;
import java.util.*;

public class uebung1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z1, z2;
        System.out.print("1. Zahl: ");
        z1= in.nextInt();
        System.out.print("2. Zahl: ");
        z2= in.nextInt();

        System.out.println(multi(z1,z2));
    }

    public static int multi(int z1, int z2){
        int erg = 0;

        for (int i = 0; i<z2;i++){
            erg += z1;
        }
        return(erg);

    }
}
