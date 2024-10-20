package batterfeed.LambdaExpressions.LambdaAsArgumentsDemo;
import batterfeed.LambdaExpressions.BlockLambdaDemo2.StringFunc;

public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args){
        String inStr = "Лямбда-выражения повышают эфективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr); //Одиночное лямбда-выражение
        System.out.println("Это строка в верхнем регистре: " + outStr);

        outStr = stringOp((str) -> {                          //Блочное лямбда-выражение
            String result = "";
            int i;

            for(i = 0; i < str.length(); i++)
                if(str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        }, inStr);

        System.out.println("Это строка с удалёнными пробелами: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Это обращённая строка: " +stringOp(reverse, inStr));
    }
}
