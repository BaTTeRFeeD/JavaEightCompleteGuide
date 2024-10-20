package batterfeed.Generics.OverrideDemo;

public class OverrideDemo {
    public static void main(String[] args){
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        Gen2<String> strOb2 = new Gen2<String>("Тест обощений");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());

    }
}
