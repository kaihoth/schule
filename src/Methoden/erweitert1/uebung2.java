package Methoden.erweitert1;
import java.util.*;

public class uebung2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Text: ");
        System.out.println(getTextChars(in.nextLine()));
    }

    public static String getTextChars(String text){
        int a=0,e=0,i=0,o=0,u=0;

        for (int j =0;j<text.length();j++){
            switch (text.charAt(j)){
                case 'a':
                    a++;
                    break;
                case 'A':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                case 'U':
                    u++;
                    break;

            }
        }

        return("A="+a+", E="+e+", I="+i+", O="+o+", U="+u);
    }

}
