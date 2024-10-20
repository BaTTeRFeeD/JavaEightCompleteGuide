package batterfeed.Generics;

public class NonGen {
    Object ob;

    NonGen(Object ob){
        this.ob = ob;
    }

    Object getob(){
        return ob;
    }

    void showType(){
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}
