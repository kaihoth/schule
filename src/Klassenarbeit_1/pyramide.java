package Klassenarbeit_1;

public class pyramide {
    public static void main(String[] args) {
        String luecke = "", sterne = "*";

        for (int i = 1;i<=10;i++){
            for (int j = 10-i;j>0;j--){
                luecke+=" ";
            }
            System.out.println(luecke+sterne);
            luecke="";
            sterne+="**";
        }
    }
}
