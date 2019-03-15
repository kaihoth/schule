package Schleifen.Schleifen_Zusatz;

import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int in1,in2,erg;

        System.out.println("Teilbar ohne Rest?\nGeben Sie die erste Zahl ein: ");
        in1 = scan.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        in2 = scan.nextInt();

        if(in1 % in2 == 0){
            System.out.println("Die Zahl ist ohne Rest teilbar");
        }else{
            erg = in1 % in2;
            System.out.println("Die Zahlen haben einen Rest von: "+ erg);
        }


    }
}
