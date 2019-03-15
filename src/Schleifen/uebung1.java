package Schleifen;
import java.util.Scanner;

public class uebung1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int grenz, zahlen = 0, i = 0;

        System.out.print("Grenzwert: ");
        grenz = input.nextInt();

        while (zahlen < grenz){
            i++;

            zahlen+=i;
        }

        System.out.println("Nach "+i+" wurde der Grenzwert erreicht\nDie Summe ist: "+zahlen);
    }
}
