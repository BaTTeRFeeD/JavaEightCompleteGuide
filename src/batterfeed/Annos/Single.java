package batterfeed.Annos;

import java.lang.reflect.Method;

public class Single {
    public static void main(String args[]){
        myMeth();
    }

    @Mysingle(100)
    public static void myMeth(){
        Single ob = new Single();

        try{
            Method m = ob.getClass().getMethod("myMeth");

            Mysingle anno = m.getAnnotation(Mysingle.class);

            System.out.println(anno.value());

        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }
}
