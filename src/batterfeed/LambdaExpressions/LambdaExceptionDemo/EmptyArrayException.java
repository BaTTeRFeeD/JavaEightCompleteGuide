package batterfeed.LambdaExpressions.LambdaExceptionDemo;

public class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Массив пуст");
    }
}
