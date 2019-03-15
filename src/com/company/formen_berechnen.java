package com.company;
import java.util.Scanner;

public class formen_berechnen {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String in;

        System.out.print("==================================\n=======  Formen rechner  =========\n==================================\nWelchen Körper möchten Sie berechnen? (\"zylinder\", \"wuerfel\", \"quader\") : ");

        in = input.nextLine();

        switch (in){
            case "zylinder":
                double zH, zR, zA, zV;
                System.out.print("Bitte geben Sie die Höhe des Zylinders an:");
                zH = input.nextDouble();
                System.out.print("Bitte geben Sie den Radius des Zylinders an:");
                zR = input.nextDouble();
                zA = (2 * Math.PI * zR * (zR + zH));
                zV = (Math.PI * Math.pow(zR, 2) * zH);
                System.out.println("------------------------\nFür ihren Zylinder wurde folgendes berechnet:\nOberfläche: "+ zA + " m^2\nVolumen: "+ zV +" m^3\n------------------------");
                break;
            case "wuerfel":
                double wL, wA, wV;
                System.out.print("Bitte geben Sie die Länger einer Seite an:");
                wL = input.nextDouble();
                wA = (6 * Math.pow(wL,2));
                wV = (Math.pow(wL, 3));
                System.out.println("------------------------\nFür ihren Würfel wurde folgendes berechnet:\nOberfläche: "+ wA + " m^2\nVolumen: "+ wV +" m^3\n------------------------");
                break;
            case "quader":
                double qH, qL, qB, qA, qV;
                System.out.print("Bitte geben Sie die Höhe des Quaders an:");
                qH = input.nextDouble();
                System.out.print("Bitte geben Sie die Länge des Quaders an:");
                qL = input.nextDouble();
                System.out.print("Bitte geben Sie die Breite des Quaders an:");
                qB = input.nextDouble();
                qA = (qL*qH);
                qV = (qL*qB*qH);
                System.out.println("------------------------\nFür ihren Quader wurde folgendes berechnet:\nOberfläche: "+ qA + " m^2\nVolumen: "+ qV +" m^3\n------------------------");
                break;
            default:
                System.err.println("Die Eingabe \""+in+"\" existiert nicht");
                break;
        }

    }
}
