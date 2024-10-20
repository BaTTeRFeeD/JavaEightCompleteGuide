package batterfeed.Annos;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    public static void main(String args[]){
        myMeth("тест", 10);
    }
    @MyAnno(str = "Первая аннотация", value = -1)
    @MyAnno(str = "Вторая аннотация", value = 100)
    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();
        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }
}
