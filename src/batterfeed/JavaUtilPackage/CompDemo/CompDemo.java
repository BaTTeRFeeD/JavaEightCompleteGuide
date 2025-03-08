package batterfeed.JavaUtilPackage.CompDemo;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element : ts)
            System.out.println(element + " ");
        System.out.println();
    }
}
