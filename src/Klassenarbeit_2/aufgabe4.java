package Klassenarbeit_2;
import java.util.*;
public class aufgabe4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie einen Text ein: ");
        String string = in.nextLine();

        for (int i=0;i<string.length();i++){
            if(i%5 == 0){
                System.out.print(string.charAt(i));
            }
        }
    }
}
