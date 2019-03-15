package Klassenarbeit_1;

import java.util.Scanner;

public class fuehrerscheinAlterCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alter;
        System.out.print("Geben Sie ihr Alter ein: ");
        alter = in.nextInt();

        if(alter < 14){
            System.err.println("Du darfst noch nicht Mofa fahren");
        }else if(alter >= 14 && alter < 16){
            System.err.println("Du darfst Mofa fahren aber kein Moped");
        }else if(alter >= 16 && alter < 18){
            System.err.println("Du darfst Moped fahren aber kein Auto");
        }else if(alter >= 18){
            System.err.println("Du darfst Auto fahren");
        }
    }
}
