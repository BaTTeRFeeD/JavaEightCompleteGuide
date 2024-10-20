package batterfeed.Annos;

import java.lang.reflect.Method;

public class Marker {
    public static void main(String args[]){
        myMeth();
    }

    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try{
            Method m = ob.getClass().getMethod("myMeth");

            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркет присутствует");
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }
}
