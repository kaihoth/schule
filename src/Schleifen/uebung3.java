package Schleifen;
import java.util.Scanner;

public class uebung3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double durch, summe =0;
        int eing=0, in;


        do {
            System.out.print("Geben Sie eine Zahl ein: ");
            in = input.nextInt();

            summe += in;
            if(in >= 1){
                eing++;
            }
        }while (in != 0);

        durch = summe/eing;
        System.out.println("Durchschnitt: "+durch+"\nSumme: "+summe);
    }
}
