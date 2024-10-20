package batterfeed.Generics.HierDemo2;


public class HierDemo2 {
    public static void main(String args[]){
        Gen<String> w = new Gen<String>("Добро Пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
