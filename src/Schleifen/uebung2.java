package Schleifen;
import java.util.Scanner;

public class uebung2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=2,x,y=0;
        System.out.print("Geben Sie eine Zahl ein: ");
        x = input.nextInt();

        if(x <= 1){
            y = 1;
        }else {
            while (Math.pow(i,2) <= x && y == 0){
                if(x%i == 0){
                    y = 1;
                }

                i++;
            }
        }

        if(y == 0){
            System.out.println(x+" ist eine Primzahl");
        }else{
            System.out.println(x+" ist keine Primzahl");
        }






    }
}
