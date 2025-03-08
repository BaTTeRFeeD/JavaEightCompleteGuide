package batterfeed.JavaUtilPackage.CompDemo;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String a, b;
        a = o1;
        b = o2;
        return b.compareTo(a);
    }
}
