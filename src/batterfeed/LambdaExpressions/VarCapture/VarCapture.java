package batterfeed.LambdaExpressions.VarCapture;

public class VarCapture {
    public static void main(String[] args){
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

          //num++; ОШИБКА! num нельзя видоизменить

            return v;
        };

      //num = 9; ОШИБКА! num больше не завершённая переменная, значит использовать её в лямбда нельзя
    }
}
