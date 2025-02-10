package batterfeed.JavaUtilPackage.ArrayListToArray;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Содержимое списочного массива al:" + al);

        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        for(int i : ia) sum += i;

        System.out.println("Сумма: " + sum);
    }
}
