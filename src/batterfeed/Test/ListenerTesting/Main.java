package batterfeed.Test.ListenerTesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CIAN = "\u001B[36m";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Player player = new Player(100);

        HealingAmulet ha1 = new HealingAmulet("Amulet of 10", 10);
        HealingAmulet ha2 = new HealingAmulet("Ring of Heal", 5);

        player.addHealingListener(ha1::using);
        player.addHealingListener(ha2::using);

        System.out.println(ANSI_CIAN + "Insert \"stop\" to end the program.\nAvailable command: " + ANSI_RESET + "damage <value>; show health; stop" + ANSI_RESET);

        infWhile:
        while (true){
            String input = br.readLine();
            if(input.trim().equals("stop")) break infWhile;
            else if(input.trim().equals("show health")) player.showHealth();
            else if(input.contains("damage")){
                int value = Integer.parseInt(input.split("damage")[1].trim());
                player.damage(value);
            } else{
                System.out.println(ANSI_RED + "Unknown command." + ANSI_RESET);
            }
        }
    }
}
