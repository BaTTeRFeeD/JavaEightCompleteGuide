package batterfeed.Generics;

public class SimpGen {
    public static void main(String[] args){
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщение");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
