package batterfeed.Generics.HierDemo3;

public class Gen<T> {
    T ob;

    Gen(T ob){
        this.ob=ob;
    }

    T getOb(){
        return ob;
    }
}
