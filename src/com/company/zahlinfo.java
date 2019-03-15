package com.company;
import java.util.Scanner;

public class zahlinfo {
    public static void main(String[] args){
        double zahl;
        Scanner input = new Scanner(System.in);

        System.out.print("Zahlinfo\nZahl: ");
        zahl = input.nextDouble();


        if(zahl > 0 && zahl % 2 == 0){
            System.out.println("Die Zahl ist größer als 0 und gerade");
        }else if(zahl > 0 && zahl % 2 > 0) {
            System.out.println("Die Zahl ist größer als 0 und ungerade");
        }else if (zahl < 0){
            System.out.println("Die Zahl ist kleiner oder gleich 0");
        }


    }
}
