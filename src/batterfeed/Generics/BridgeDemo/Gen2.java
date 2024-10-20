package batterfeed.Generics.BridgeDemo;

public class Gen2 extends Gen<String> {
    Gen2(String ob) {
        super(ob);
    }

    @Override
    String getob(){
        System.out.print("Метод String getob(): ");
        return ob;
    }
}
