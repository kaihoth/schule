package Methoden.erweitert1;
import java.util.*;

public class uebung2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Text: ");
        System.out.println(getTextChars(in.nextLine()));
    }

    public static String getTextChars(String text){
        String counter = "";
        int a=0,e=0,i=0,o=0,u=0;

        for (int j =0;i<text.length();j++){
            switch (text.charAt(j)){
                case 'a':a++;
            }
        }

        return(counter);
    }

}
