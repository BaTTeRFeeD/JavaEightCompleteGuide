package batterfeed.Generics;

public class Gen<T>{
    T ob;
    
    Gen(T ob){
        this.ob = ob;
    }    
    
    T getob(){
        return ob;
    }
    
    void showType(){
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}