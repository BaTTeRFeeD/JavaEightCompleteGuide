package batterfeed.Generics;

public class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T t, V v){
        super(t);
        ob2=v;
    }
    V getOb2(){
        return ob2;
    }
}
