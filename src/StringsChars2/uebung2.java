package StringsChars2;

import java.util.*;

public class uebung2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie eine Zeichenkette ein: ");

        String kette = in.nextLine();

        int doppel = 0;
        int ei = 0;
        int au = 0;
        int aeu = 0;
        int eu = 0;
        int ai = 0;
        int oi = 0;
        int ui = 0;

        for (int i = 0;i<kette.length()-1;i++){
            char c1 = kette.charAt(i);
            char c2 = kette.charAt(i+1);

            String c = Character.toString(c1)+ Character.toString(c2);

            switch (c){
                case "ei":
                    doppel++;
                    ei++;
                    System.out.println("EI Gefunden");
                    break;
                case "au":
                    doppel++;
                    au++;
                    System.out.println("AU Gefunden");
                    break;
                case "äu":
                    doppel++;
                    aeu++;
                    System.out.println("ÄU Gefunden");
                    break;
                case "ai":
                    doppel++;
                    ai++;
                    System.out.println("AI Gefunden");
                    break;
                case "eu":
                    doppel++;
                    eu++;
                    System.out.println("EU Gefunden");
                    break;
                case "oi":
                    doppel++;
                    oi++;
                    System.out.println("OI Gefunden");
                    break;
                case "ui":
                    doppel++;
                    ui++;
                    System.out.println("UI Gefunden");
                    break;
            }

        }

        System.out.println("Doppellaute: "+doppel+"\nEI: "+ei+"\nAU: "+au+"\nÄU: "+aeu+"\nEU: "+eu+"\nAI: "+ai+"\nOI: "+oi+"\nUI: "+ui);
    }

}
