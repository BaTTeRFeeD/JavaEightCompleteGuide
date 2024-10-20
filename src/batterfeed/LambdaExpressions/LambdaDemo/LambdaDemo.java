package batterfeed.LambdaExpressions.LambdaDemo;

public class LambdaDemo {
    public static void main(String[] args){
        MyNumber myNum;
        myNum = () -> 123.45D;

        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Случайное значение: " + myNum.getValue());

      //myNum = () -> "123.45"; Ошибка!
    }
}
