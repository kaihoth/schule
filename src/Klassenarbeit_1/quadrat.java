package Klassenarbeit_1;

public class quadrat {
    public static void main(String[] args) {
        int x = 5;
        for (int i = x;i>0;i--){
            if(i == x || i == 1){
                for (int j = x;j>0;j--){
                    System.out.print("*");
                }
            }else {
                for (int k = x;k>0;k--){
                    if (k==x || k==1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
