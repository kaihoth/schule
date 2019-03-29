package Methoden.erweitert1;
import java.util.*;

public class uebung4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie eine Zahl an: ");

        System.out.println(three(in.nextInt()));
    }

    public static boolean three(int number){
        if(number % 3 == 0){
            return true;
        }
        else return false;
    }
}
