package batterfeed.Generics;

public class GenIFDemo {
    public static void main(String[] args){
        Integer inums[] = {3,6,2,8,6};
        Character chs[]= {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Максимальное значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());

        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
    }
}
