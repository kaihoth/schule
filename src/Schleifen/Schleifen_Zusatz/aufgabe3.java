package Schleifen.Schleifen_Zusatz;
import java.util.Scanner;
public class aufgabe3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double note;
        System.out.print("Geben Sie die Note ein: ");
        note = in.nextDouble();

        if(note <= 1.5 && note >= 1){
            System.err.println("Die Note ist: \"Sehr Gut | 1\"");
        }else if(note <= 2.5 && note >= 1.5){
            System.err.println("Die Note ist: \"Gut | 2\"");
        }else if(note <= 3.5 && note >= 2.5){
            System.err.println("Die Note ist: \"Befriedigend | 3\"");
        }else if(note <= 4.5 && note >= 3.5){
            System.err.println("Die Note ist: \"ausreichend | 4\"");
        }else if(note <= 5.5 && note >= 4.5){
            System.err.println("Die Note ist: \"mangelhaft | 5\"");
        }else if(note <= 6 && note >= 5.5){
            System.err.println("Die Note ist: \"ungenügend | 6\"");
        }
    }
}
