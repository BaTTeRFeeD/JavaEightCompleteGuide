package batterfeed.Test.ListenerTesting;

import java.util.ArrayList;

public class Player {
    private int health;
    private ArrayList<IHealingListener> healingListeners;

    Player(int health){
        this.health = health;
        healingListeners = new ArrayList<>();
    }

    public void showHealth(){
        System.out.println("Player health: " + health);
    }

    public boolean addHealingListener(IHealingListener healingListener) {
        return healingListeners.add(healingListener);
    }

    public void healingListenersCallback(){
        for(var hl : healingListeners) health += hl.getHealing();
    }

    public void damage(int value){
        if(value > health) return;
        health -= value;
        healingListenersCallback();
    }
}
