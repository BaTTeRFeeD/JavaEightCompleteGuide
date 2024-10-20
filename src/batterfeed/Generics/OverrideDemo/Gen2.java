package batterfeed.Generics.OverrideDemo;

public class Gen2<T> extends Gen<T>{
    Gen2(T ob) {
        super(ob);
    }

    @Override
    T getob(){
        System.out.print("Метод getob() из класса Gen2: ");
        return ob;
    }
}
