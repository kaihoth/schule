package Methoden2;
import java.util.*;

public class uebung1 {
    public static int[][] matrize1, matrize2;

    public static void main(String[] args) {
        eingabe();
        ausgabe();
        transponieren();

    }

    public static void eingabe(){
        Scanner in = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Dimensionen an: ");
        int dimensions = in.nextInt();

        matrize1 = new int[dimensions][dimensions];

        for (int i = 0; i<dimensions;i++){
            for (int j = 0; j<dimensions;j++){
                matrize1[i][j] = (int)(Math.random()*10);
            }
        }

    }

    public static void ausgabe(){
        for (int i = 0; i<matrize1.length;i++){
            for (int j = 0; j<matrize1.length;j++){
                if(j != matrize1.length-1){
                    System.out.print(matrize1[i][j]+", ");
                }else System.out.print(matrize1[i][j]);
            }
            System.out.println();
        }
    }

    public static void transponieren(){
        matrize2 = new int[matrize1.length][matrize1.length];

        for (int i=0;i<matrize1.length;i++){
            for (int j=0;j<matrize1.length;j++){
                matrize2[j][i]=matrize1[i][j];
            }
        }
    }

    public static void addieren(){

    }
}
