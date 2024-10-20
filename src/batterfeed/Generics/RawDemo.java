package batterfeed.Generics;

public class RawDemo {
    public static void main(String[] args){
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Тест обощений");

        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getob();
        System.out.println("Значение: " + d);
    }
}
