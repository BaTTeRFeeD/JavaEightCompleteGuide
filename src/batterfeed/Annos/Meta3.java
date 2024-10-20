package batterfeed.Annos;

import java.lang.reflect.Method;

public class Meta3 {
    public static void main(String args[]){
        myMeth();
    }

    @MyAnno
    public static void myMeth(){
        Meta3 ob = new Meta3();
        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }
}
