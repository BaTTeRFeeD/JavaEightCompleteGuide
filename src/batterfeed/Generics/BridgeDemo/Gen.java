package batterfeed.Generics.BridgeDemo;

public class Gen<T> {
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getob(){
        return ob;
    }
}
