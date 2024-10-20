package batterfeed.Generics;

public class GenConsDemo {
    public static void main(String[] args){
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(100.5f);

        test.showVal();
        test2.showVal();
    }
}
