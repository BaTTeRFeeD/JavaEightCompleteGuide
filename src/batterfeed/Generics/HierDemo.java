package batterfeed.Generics;

public class HierDemo {
    public static void main(String[] args){
        Gen2<String, Integer> x = new Gen2<String, Integer>("Значение равно: ", 99);

        System.out.print(x.getob());
        System.out.println(x.getOb2());
    }
}
