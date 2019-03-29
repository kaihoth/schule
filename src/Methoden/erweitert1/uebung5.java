package Methoden.erweitert1;
import java.util.*;

public class uebung5 {
    public static void main(String[] args) {
        tripyramide();
    }

    public static void tripyramide(){
        for(int i = 0;i<9;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
