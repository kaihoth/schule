package StringsChars;

import java.util.Scanner;

public class uebung1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie einen Text ein: ");

        String text = in.nextLine();
        String ntext = "";
//---------
        String[] seg = text.split("[aeiouAEIOU]");

        for (int i=0;i<seg.length;i++){
            System.out.print(seg[i]);
        }
//---------
        for (int i=0;i<text.length();i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e'|| text.charAt(i) == 'i'|| text.charAt(i) == 'o'|| text.charAt(i) == 'u'|| text.charAt(i) == 'A'|| text.charAt(i) == 'E'|| text.charAt(i) == 'I'|| text.charAt(i) == 'O'|| text.charAt(i) == 'U'){

            }else {
                ntext += text.charAt(i);
            }
        }

        System.out.println("\n"+ntext);

        for (int i=0;i<text.length();i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e'|| text.charAt(i) == 'i'|| text.charAt(i) == 'o'|| text.charAt(i) == 'u'|| text.charAt(i) == 'A'|| text.charAt(i) == 'E'|| text.charAt(i) == 'I'|| text.charAt(i) == 'O'|| text.charAt(i) == 'U'){

            }else {
                ntext += text.charAt(i);
            }
        }

        System.out.println("\n"+ntext);
    }
}
