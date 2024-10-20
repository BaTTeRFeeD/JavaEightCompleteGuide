package batterfeed.BoxingUnboxing;

public class AutoBox2 {
    public static void main(String args[]){

        Integer iOb = m(100);

        System.out.println(iOb);
    }

    static int m(Integer v){
        return v; //автораспаковка
    }
}
