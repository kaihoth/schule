package StringsChars;

import java.util.Arrays;
import java.util.Scanner;

public class uebung2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie einen Satz ein: ");

        String text = in.nextLine();

        String[] seg = text.split(" ");

        String pass = "";

        System.out.println(Arrays.toString(seg));

        for (int i=0;i<seg.length;i++){
            int j = 0;
            if(!seg[i].isEmpty()) {
                j = seg[i].length();
                pass += seg[i].charAt(j-1);
            }
        }

        System.out.println(pass);
    }
}
