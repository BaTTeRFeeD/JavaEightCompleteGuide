package batterfeed.Annos;

import java.lang.reflect.Method;
import java.lang.annotation.*;

@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", value = 99)
public class Meta2 {

    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", value = 100)
    public static void myMeth(){
        Meta2 ob = new Meta2();

        try{
            Annotation annos[] = ob.getClass().getAnnotations();

            System.out.println("Все аннотации для класса Meta2:");
            for(Annotation a : annos)
                System.out.println(a);

            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth():");
            for(Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException e){
            System.out.println("Метод не найден");
        }
    }
    public static void main(String args[]){
        myMeth();
    }
}
