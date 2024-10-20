package batterfeed.LambdaExpressions.ConstructorRefDemo;

public class ConstructorRefDemo {

    public static void main(String args[]){
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
