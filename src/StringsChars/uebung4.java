package StringsChars;

import java.util.Scanner;
import java.util.Arrays;

public class uebung4 {
    public static void main(String[] args) {
        String pass;

        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie ein Passwort ein: ");

        pass = in.nextLine();

        char c;
        int length = pass.length();
        int letters = 0;
        int digits = 0;
        int upper = 0;
        int lower = 0;
        int special = 0;

        boolean bLength = false;
        boolean bLetters = false;
        boolean bDigits = false;
        boolean bUpper = false;
        boolean bLower = false;
        boolean bSpecial = false;

        boolean bError = false;
        String error ="";

        if(length >=10){
            bLength = true;
        }

        for(int i = 0; i<length;i++){
            c = pass.charAt(i);

            if(Character.isLetter(c)){
                letters++;
                if(letters >= 3){
                    bLetters = true;
                }
            }
            if(Character.isDigit(c)){
                digits++;
                if(digits >= 2){
                    bDigits = true;
                }
            }
            if(Character.isUpperCase(c)){
                upper++;
                if(upper >= 1){
                    bUpper = true;
                }
            }
            if(Character.isLowerCase(c)){
                lower++;
                if(lower >= 1){
                    bLower = true;
                }
            }
            if(!Character.isLetterOrDigit(c)){
                special++;
                if(special >= 1){
                    bSpecial = true;
                }
            }
        }

        if(!bLength){
            bError = true;
            error += " zu kurz,";
        }
        if(!bLetters){
            bError = true;
            error += "zu wenig Ziffern,";
        }
        if(!bDigits){
            bError = true;
            error += " zu wenig Zahlen,";
        }
        if(!bUpper){
            bError = true;
            error += " zu wenig Großbuchstaben,";
        }
        if(!bLower){
            bError = true;
            error += " zu wenig Kleinbuchstaben,";
        }
        if(!bSpecial){
            bError = true;
            error += " zu wenig Sonderzeichen";
        }

        if(!bError){
            System.out.println("Das Passwort \""+pass+"\" ist sicher!");
        }else {
            System.out.println("Das Passwort \""+pass+"\" hat folgende Fehler: "+ error);
        }

    }
}
