package batterfeed.LambdaExpressions.InstanceMethWithObjectRefDemo;

public class HighTemp {
    private int hTemp;

    HighTemp(int hTemp){
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    boolean lessThatTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}
