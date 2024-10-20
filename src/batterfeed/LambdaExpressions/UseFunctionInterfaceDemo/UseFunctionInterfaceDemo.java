package batterfeed.LambdaExpressions.UseFunctionInterfaceDemo;
import java.util.function.Function;

public class UseFunctionInterfaceDemo {


    public static void main(String[] args){
        Function<Integer, Integer> factroial = (n) -> {
            int result = 1;
            for(int i=1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println("Факториал числа 3 равен " + factroial.apply(3));
        System.out.println("Факториал числа 5 равен " + factroial.apply(5));
    }
}
