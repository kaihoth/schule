package Klassenarbeit_2;
import java.util.*;
public class aufgabe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Geben Sie einen Satz ein: ");
        String string = in.nextLine();
        String[] ar = string.split(" ");

        for (int i = 0; i < ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
