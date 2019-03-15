package Schleifen;
import java.util.Scanner;

public class uebung4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rand = (int) (Math.random()*100);
        int tries = 0;
        boolean found = false;

        while(!found){
            System.out.println("Suchen Sie die Zahl");
            int in = input.nextInt();
            tries++;
            if(in == rand){
                System.out.println("RICHTIG! Sie haben die richtige Zahl erraten!\nVersuche: " + tries);
                found = true;
            }else if(in > rand){
                System.out.println("Falsch! Die Zahl ist kleiner!\nVersuche: " + tries);
                found = false;
            }else if(in < rand){
                System.out.println("Falsch! Die ZAhl ist größer!\nVersuche: " + tries);
                found = false;
            }
        }
    }
}
