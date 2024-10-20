package batterfeed.Generics.HierDemo2;

public class Gen<T> extends NonGen {
    T ob;
    Gen(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}
