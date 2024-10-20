package batterfeed.LambdaExpressions.GenericFunctionalInterfaceDemo;


public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args){
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
        System.out.println(reverse.func("Лямбда"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i <= n; i++)
                result *= i;

            return result;
        };

        System.out.println("факториал числа 3 равен " + factorial.func(3));
        System.out.println("факториал числа 5 равен " + factorial.func(5));
    }
}
