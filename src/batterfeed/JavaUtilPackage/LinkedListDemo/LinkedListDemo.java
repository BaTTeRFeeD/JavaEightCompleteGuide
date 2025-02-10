package batterfeed.JavaUtilPackage.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        System.out.println("Начальный размер списочного массива ll: " + ll.size());

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Исходное содержимое списочного массива ll:" + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое списочного массива ll после удаления элементов: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое списочного массива ll после удаления первого и последнего элементов: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое списочного массива ll:" + ll);
    }
}
