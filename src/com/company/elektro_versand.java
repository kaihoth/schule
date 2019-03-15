package com.company;
import java.util.Scanner;

public class elektro_versand {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double v1 = 100;
        final double v1v = 5.5;
        final double v2 = 250;
        final double v2v = 3;
        boolean err = false;

        while(!err){

            double kosten,rechnung;

            System.out.print("Berechnung Rechnungsbetrag\n Auftragssumme: ");
            kosten = input.nextDouble();

            if(kosten < v1){
                rechnung = kosten+v1v;
            }else if(kosten < v2 && kosten <= v1){
                rechnung = kosten+v2v;
            }else if (kosten >= v2) {
                rechnung = kosten;
            }else {
                rechnung = 0;
                err = true;
                System.err.println("ERR");
            }

            System.out.println("Rechnungsbetrag: "+rechnung+"€\n Programmende");
        }

    }

}
