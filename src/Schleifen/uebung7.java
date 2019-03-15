package Schleifen;
import java.util.Scanner;

public class uebung7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in, i = 0;

        System.out.print("Matrix 0 .. 99\nZahl (2..9): ");
        in = input.nextInt();
        String str = "";

        while(i <= 99){
            str = "";
            for (int n = 0; n <= 9; n++){
                if(i<=9){
                    str += " ";
                }
                if(i == in || i % in == 0 || i % 10 == in || i / 10 == in){
                    if(i<=9 && i != 0){
                        str += "* ";
                    }else if(i != 0){
                        str += " * ";
                    }else{
                        str += i+" ";
                    }
                }else{
                    str += i+" ";
                }
                i++;
            }
            System.out.println(str);
        }
    }
}
