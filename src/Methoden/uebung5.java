package Methoden;

public class uebung5 {
    public static void main(String[] args) {
        int exp = 25;
        System.out.println("2^"+exp+" = "+zweiHoch(exp));

    }

    public static int zweiHoch(int exponent){
        if(exponent <= 0){
            return 1;
        }
        return (int) Math.pow(2,exponent);
    }
}
