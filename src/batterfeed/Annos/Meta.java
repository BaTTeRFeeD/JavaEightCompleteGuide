package batterfeed.Annos;

import java.lang.reflect.*;

public class Meta {
    @MyAnno(str = "Пример", value = 100)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();

        try{
            Class<?> c = ob.getClass();
            // Class<?> c = Meta.class; если класс известен

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.value());
        } catch (NoSuchMethodException e){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String args[]){
        myMeth("Test", 10);
    }
}
