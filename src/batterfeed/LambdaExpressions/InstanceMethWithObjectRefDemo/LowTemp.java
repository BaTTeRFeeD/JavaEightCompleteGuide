package batterfeed.LambdaExpressions.InstanceMethWithObjectRefDemo;

public class LowTemp {         //ДЛЯ ТЕСТА
    private int lTemp;

    LowTemp(int hTemp){
        this.lTemp = hTemp;
    }

    boolean sameTemp(LowTemp ht2){
        return lTemp == ht2.lTemp;
    }

    boolean lessThatTemp(LowTemp ht2){
        return lTemp < ht2.lTemp;
    }
}
