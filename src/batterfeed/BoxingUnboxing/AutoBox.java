package batterfeed.BoxingUnboxing;

public class AutoBox {
    public static void main(String args[]){
        Integer iOb = 100; //автоупаковка значения

        int i = iOb;       //автораспаковка значения

        System.out.println(i + " " + iOb);
    }
}
