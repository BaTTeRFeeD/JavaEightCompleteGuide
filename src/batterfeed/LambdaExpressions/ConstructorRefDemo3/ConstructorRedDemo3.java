package batterfeed.LambdaExpressions.ConstructorRefDemo3;

public class ConstructorRedDemo3 {

    /**
     * Фабричный метод для объектов разных классов.
     * У каждого класса должен быть свой конструктор, принимающий один параметр типа T.
     * А параметр R обозначает тип создаваемого объекта.
     * @param cons
     * @param v
     * @return
     * @param <R>
     * @param <T>
     */
    static <R,T> R myClassFactory(MyFunc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args){

        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        MyClass<Double> mc = myClassFactory(myClassCons, 100.1d);

        System.out.println("Значение val в объекте mc равно: " + mc.getVal());



        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение str в объекте mc2 равно: " + mc2.getVal());

    }

}
