package batterfeed.Test.ListenerTesting;

public class HealingAmulet {
    private final String NAME;
    private final int HEALING_POWER;

    HealingAmulet(String name, int healingPower){
        this.NAME = name;
        this.HEALING_POWER = healingPower;
    }

    public int using(){
        System.out.println("> Healing Amulet \"" +
                NAME + "\" restored " + HEALING_POWER + " health.");
        return HEALING_POWER;
    }

}
