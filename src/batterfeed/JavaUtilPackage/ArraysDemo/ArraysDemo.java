package batterfeed.JavaUtilPackage.ArraysDemo;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = -3 * i;
        }

        System.out.println("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);
    }

    public static void display(int array[]){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
