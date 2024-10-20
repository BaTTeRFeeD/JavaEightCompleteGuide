package batterfeed.LambdaExpressions.MethodRefDemo2;



public class MethodRefDemo2 {
    public static void main(){
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }

    public static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
}
