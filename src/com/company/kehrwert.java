package com.company;
import java.util.Scanner;

public class kehrwert {
    public static void main(String[] args){

        double zahl,kehrwert;
        boolean err = false;
        Scanner input = new Scanner(System.in);

        while(!err) {
            System.out.println("Kehrwert berechnen");
            System.out.print("Geben Sie eine Zahl ein: ");
            zahl = input.nextDouble();

            if (zahl != 0) {
                err = false;
                kehrwert = 1 / zahl;
                System.out.println("Der Kehrwert von " + zahl + " ist " + kehrwert);
            } else {
                err = true;
                System.err.println("ERR: Von 0 kann kein Kehrwert gebildet werden");
            }
        }


    }
}
