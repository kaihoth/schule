package Methoden.erweitert1;
import java.util.*;

public class uebung3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Geben Sie den Kreis Radius an: ");
        double rad = in.nextDouble();
        System.out.println("Kreisumfang: "+kreisumfang(rad)+"cm, Kreisfläche: "+kreisflaeche(rad)+"cm^2");
    }

    public static double kreisumfang(double radius){
        return(Math.round((Math.PI * 2 * radius) * 100.0)/100.0);
    }

    public static double kreisflaeche(double radius){
        return(Math.round((Math.PI * (radius*radius))*100.0)/100.0);
    }
}
