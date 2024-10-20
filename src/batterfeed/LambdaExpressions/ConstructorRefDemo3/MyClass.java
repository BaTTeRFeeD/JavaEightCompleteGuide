package batterfeed.LambdaExpressions.ConstructorRefDemo3;

public class MyClass<T> {
    private T val;

    MyClass(T v){val = v;}


    MyClass(){val = null;}

    T getVal(){return val;}

}
