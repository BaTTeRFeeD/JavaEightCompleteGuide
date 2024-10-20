package batterfeed.Test;

public class Gen<T> {
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getob(){
        return ob;
    }
}
