package batterfeed.Generics.OverrideDemo;

public class Gen<T> {
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getob(){
        System.out.print("Метод getob() из класса Gen: ");
        return ob;
    }

    void showType(){
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}
