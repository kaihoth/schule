package Schleifen;
import java.util.Scanner;

public class uebung6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int min,max;
        String str = "";

        System.out.print("Minimum: ");
        min = input.nextInt();
        System.out.print("Maximum: ");
        max = input.nextInt();


        for(int i = min+1; i <= max-1; i++){
            if(i % 2 == 0){
                str += i+" ";
            }
        }

        System.out.println(str);
    }
}
