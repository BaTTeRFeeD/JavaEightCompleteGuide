package batterfeed.LambdaExpressions.ConstructorRefDemo2;

public class ConstructorRefDemo2 {

    public static void main(String args[]){
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        MyClass<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
