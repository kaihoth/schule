package Klassenarbeit_2;
import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {

        int [] ar = new int[8];
        Scanner in = new Scanner(System.in);

        for (int i = 0;i<ar.length;i++){
            System.out.print("Geben Sie die "+(i+1)+". Zahl ein: ");
            ar[i] = in.nextInt();
        }

        System.out.println("----------\nArray Größe: "+ar.length);
        for (int i = 0;i<ar.length;i++){
            System.out.println("Array "+i+" = "+ar[i]);
        }

    }
}
