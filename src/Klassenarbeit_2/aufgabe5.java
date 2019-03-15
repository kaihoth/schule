package Klassenarbeit_2;
import java.util.*;
public class aufgabe5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Geben Sie einen Text ein: ");
        String string = in.nextLine();
        int cA=0,cE=0,cI=0,cO=0,cU = 0;

        for (int i=0;i<string.length();i++){
            switch (string.charAt(i)){
                case 'a':
                    cA++;
                    break;
                case 'A':
                    cA++;
                    break;
                case 'e':
                    cE++;
                    break;
                case 'E':
                    cE++;
                    break;
                case 'i':
                    cI++;
                    break;
                case 'I':
                    cI++;
                    break;
                case 'o':
                    cO++;
                    break;
                case 'O':
                    cO++;
                    break;
                case 'u':
                    cU++;
                    break;
                case 'U':
                    cU++;
                    break;

            }
        }

        System.out.println(cA+"*A "+cE+"*E "+cI+"*I "+cO+"*O "+cU+"*U");
    }
}
