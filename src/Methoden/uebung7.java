package Methoden;
import java.util.Scanner;

public class uebung7 {
    public static void main(String[] args) {

        int n;
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte Anzahl der Reihenglieder eingeben: ");
        n = eingabe.nextInt();

        System.out.println(harmonic(n));

    }

    public static double harmonic(int anzahl){
        double folge = 0;

        for(int i = 1; i <= anzahl; i++){
            folge = folge + (1.0/i);
        }

        return folge;

    }
}
