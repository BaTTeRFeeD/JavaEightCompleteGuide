package batterfeed.JavaUtilPackage.MainList;

import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "876 Elm St", "Champaign", "IL", "61820"));

        for(Address alement : ml)
            System.out.println(alement + "\n");

        System.out.println();
    }
}
