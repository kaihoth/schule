package StringsChars2;

import java.util.Scanner;

public class uebung1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Erste Zeichenkette: ");
        String s1 = in.nextLine();

        System.out.print("Zweite Zeichenkette: ");
        String s2 = in.nextLine();

        int s1length = s1.length();
        int s2length = s2.length();

        int diffCount = 0;
        int length;

        if(s1length<s2length){
            diffCount = s2length - s1length;
            length = s2length-diffCount;
        }else if(s1length>s2length){
            diffCount = s1length - s2length;
            length=s1length-diffCount;
        }else {
            length = s1length;
        }

        String diff1 = "";
        String diff2 = "";

        int dc = 0;

        for (int i = 0;i<length;i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == c2){
                System.out.println("GLEICH: Der Charakter an stelle \""+(i+1)+"\" lautet in String 1: \""+c1+"\" und in String 2: \""+c2+"\" !!");
            }else{
                diff1 += c1;
                diff2 += c2;
                dc++;
                System.out.println("UNTERSCHIED: Der Charakter an stelle \""+(i+1)+"\" lautet in String 1: \""+c1+"\" und in String 2: \""+c2+"\" !!");
            }
        }

        if(s1length < s2length){
            System.out.println("UNTERSCHIED: Der String 2 ist \""+diffCount+"\" Zeichen länger !!\nFolgende Zeichen hat String 2 zusätzlich: ");

            for (int i = diffCount; i > 0; i--){
                char c = s2.charAt(s2length-i);
                System.out.println("  ~ "+c);
            }
        }
        if(s1length > s2length){
            System.out.println("\nUNTERSCHIED: Der String 1 ist \""+diffCount+"\" Zeichen länger !!\nFolgende Zeichen hat String 1 zusätzlich: ");

            for (int i = diffCount; i > 0; i--){
                char c = s1.charAt(s1length-i);
                System.out.println("  ~ "+c);
            }
        }

        System.out.println("\n----------------------------\nEs wurden \""+(dc+diffCount)+"\" Unterschiede gefunden!");



    }
}
