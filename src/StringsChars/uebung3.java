package StringsChars;

import java.util.Arrays;
import java.util.Scanner;

public class uebung3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie einen Satz ein: ");

        String text = in.nextLine();

        String[] seg = text.split(" ");

        String pass = "";
        char key;
        int k = 0;

        System.out.println(Arrays.toString(seg));

        for (int i=0;i<seg.length;i++){
            int j = 0;
            if(!seg[i].isEmpty()) {
                j = seg[i].length();
                key = seg[i].charAt(j-1);
                if(Character.isLetter(key)){
                    if(k % 2 == 0){
                        key = Character.toUpperCase(key);
                    }
                    k++;
                }
                pass += key;
            }
        }

        System.out.println(pass);
    }
}
