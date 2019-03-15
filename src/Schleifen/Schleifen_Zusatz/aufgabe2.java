package Schleifen.Schleifen_Zusatz;
import java.util.Scanner;
public class aufgabe2 {
    public static void main(String[] args){
        int gTag,gMonat,gJahr,tag,monat,jahr,fsk, count;
        Scanner in = new Scanner(System.in);

        System.out.print("====================\n====   FSK   ===\n==========\nGeben Sie die FSK ein: ");
        fsk = in.nextInt();
        System.out.print("Geben Sie den GeburtsTAG ein :");
        gTag = in.nextInt();
        System.out.print("Geben Sie den GeburtsMONAT ein: ");
        gMonat = in.nextInt();
        System.out.print("Geben Sie das GeburtsJAHR ein: ");
        gJahr = in.nextInt();
        System.out.print("Geben Sie den TAG ein :");
        tag = in.nextInt();
        System.out.print("Geben Sie den MONAT ein: ");
        monat = in.nextInt();
        System.out.print("Geben Sie das JAHR ein: ");
        jahr = in.nextInt();

        if(gJahr - jahr == 0){
            if(gMonat - monat == 0){
                if(gTag - tag == 0){
                    System.out.println("Alt genug");
                }else if(gTag - tag >= 1) {
                    System.out.println("Alt genug");
                }else {
                    System.err.println("Zu Jung!");
                }
            }else if(gMonat - monat >= 1) {
                System.out.println("Alt genug");
            }else {
                System.err.println("Zu Jung!");
            }
        }else if(gJahr-jahr >= 1) {
            System.out.println("Alt genug");
        }else {
            System.err.println("Zu Jung!");
        }
    }
}
