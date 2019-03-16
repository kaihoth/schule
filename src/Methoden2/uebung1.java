package Methoden2;
import java.util.*;

public class uebung1 {
    /*
        Dises Programm generiert Matrizen und verabreitet diese in verschiedenen Methoden

        | 1  2  3 |
        | 4  5  6 |
        | 7  8  9 |


        Schreiben Sie ein Programm zur Verwaltung von Matrizen für natürliche Zahlen. Die Matrizen sollen in Arrays gehalten werden. Das Programm soll über folgende Methoden verfügen:

        Methode eingabe():
        Für die Matrize kann der Anwender die Dimension (Anzahl der Zeilen und Spalten) der Matrize, sowie deren Werte eingeben. Die Methode hat keine Eingabeparameter und gibt keinen Wert zurück.

            [0][2, 7, 6]
            [1][5, 5, 5]
            [2][7, 0, 6]

        Methode ausgabe():
        Die übergebene Matrize wird formatiert auf dem Bildschirm ausgegeben.

            2, 7, 6
            5, 5, 5
            7, 0, 6

        Methode transponieren():
        Die übergebene Matrize wird transponiert. Das bedeutet, dass in der zu transponierenden Matrize die Werte wie folgt getauscht werden: matrix[i][j] = matrix [j][i].

            2, 7, 6             2, 5, 7
            5, 5, 5     =>      7, 5, 0
            7, 0, 6             6, 5, 6

        Methode addieren():
        Zwei übergebene Matrizen (deren Anzahl an Zeilen und Spalten identisch sind) werden addiert in dem jedes Element der einen Matrize zu dem Element mit denselben Indizes der anderen Matrize addiert wird. Das Ergebnis der Addition wird in einer anderen Matrize als die übergebenen Matrizen gespeichert.

            2, 7, 6             2, 5, 7              4, 12, 13
            5, 5, 5     +       7, 5, 0     =>      12, 10,  5
            7, 0, 6             6, 5, 6             13,  5, 12

        Methode multiplizieren():
        Zwei übergebene Matrizen (deren Anzahl an Zeilen und Spalten identisch sind) werden nach folgendem Schema multipliziert: Die erste Zeile der ersten Matrize wird mit der ersten Spalte der zweiten Matrize elementweise multipliziert. Anschließend werden die Produkte addiert. Dieses Ergebnis bildet das erste Element der Ergebnis-Matrize.


     */
    public static int[][] matrize1, matrize2, matrize3, matrize4;

    public static void main(String[] args) {
        eingabe();
        transponieren();
        ausgabe();
        addieren();

        System.out.println();
        multiplizieren();

    }

    public static void eingabe(){
        Scanner in = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Dimensionen an: ");
        int dimensions = in.nextInt();

        matrize1 = new int[dimensions][dimensions];

        for (int i = 0; i<dimensions;i++){
            for (int j = 0; j<dimensions;j++){
                matrize1[i][j] = (int)(Math.random()*10);
            }
        }

    }

    public static void ausgabe(){
        for (int i = 0; i<matrize1.length;i++){
            for (int j = 0; j<matrize1.length;j++){
                if(j != matrize1.length-1){
                    System.out.print(matrize1[i][j]+", ");
                }else System.out.print(matrize1[i][j]);
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i<matrize1.length;i++){
            for (int j = 0; j<matrize1.length;j++){
                if(j != matrize1.length-1){
                    System.out.print(matrize2[i][j]+", ");
                }else System.out.print(matrize2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void transponieren(){
        matrize2 = new int[matrize1.length][matrize1.length];

        for (int i=0;i<matrize1.length;i++){
            for (int j=0;j<matrize1.length;j++){
                matrize2[j][i]=matrize1[i][j];
            }
        }
    }

    public static void addieren(){

        matrize3 = new int[matrize1.length][matrize1.length];

        for (int i=0;i<matrize1.length;i++){
            for (int j=0;j<matrize1.length;j++){
                matrize3[i][j]=matrize1[i][j]+matrize2[i][j];
            }
        }

        for (int i = 0; i<matrize1.length;i++){
            for (int j = 0; j<matrize1.length;j++){
                if(j != matrize1.length-1){
                    System.out.print(matrize3[i][j]+", ");
                }else System.out.print(matrize3[i][j]);
            }
            System.out.println();
        }
    }

    public static void multiplizieren(){
        matrize4 = new int[matrize1.length][matrize1.length];

        for (int i=0;i<matrize1.length;i++){
                matrize4[i][i]=matrize1[i][i]*matrize2[i][i];
                System.out.println(matrize1[i][i] +"*"+matrize2[i][i]+"="+matrize4[i][i]);
                if(i != matrize1.length-1){
                    matrize4[i][i]=(matrize1[i][i+1]*matrize2[i+1][i])+matrize4[i][i];
                    System.out.println(matrize1[i][i+1] +"*"+matrize2[i+1][i]+"="+matrize1[i][i+1]*matrize2[i+1][i]);
                }
        }

        for (int i = 0; i<matrize1.length;i++){
            for (int j = 0; j<matrize1.length;j++){
                if(j != matrize1.length-1){
                    System.out.print(matrize4[i][j]+", ");
                }else System.out.print(matrize4[i][j]);
            }
            System.out.println();
        }
    }
}
