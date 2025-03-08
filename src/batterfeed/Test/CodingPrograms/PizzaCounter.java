package batterfeed.Test.CodingPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class PizzaCounter {
    public static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Float[]> pizzas = new ArrayList<>(2);
        Formatter formatter = new Formatter();
        int pizzasNumber;
        try {
            System.out.print("Enter the number of pizzas: ");
            pizzasNumber = Integer.parseInt(br.readLine());
            for(int i = 0; i < pizzasNumber; i++){
                Float[] pizza = new Float[2];
                System.out.print("\tPizza " + (i+1) + " diameter: ");
                pizza[0] = Float.parseFloat(br.readLine());

                System.out.print("\tPizza " + (i+1) + " cost: ");
                pizza[1] = Float.parseFloat(br.readLine());


                pizzas.add(pizza);

                System.out.println();
            }
            System.out.println("Pizza comparison: ");
            for(int i = 0; i < pizzasNumber; i++){
                float div = pizzas.get(i)[1] / pizzaArea(pizzas.get(i)[0]);
                System.out.println("\tPizza " + (i+1) + ": " + df.format(div) + "₽");
            }

            System.out.println();

        } catch (IOException e){
            System.out.println(e);
            return;
        } catch (NumberFormatException e){
            System.out.println(e);
            return;
        }

    }

    private static float pizzaArea(float diameter){
        return (float)(Math.PI * Math.pow(diameter/2, 2));
    }
}
