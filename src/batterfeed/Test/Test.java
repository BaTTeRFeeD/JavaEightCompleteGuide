package batterfeed.Test;

import batterfeed.Annos.MyAnno;
import batterfeed.Test.CodingPrograms.BinaryCoder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println(System.getProperties());
    }

    @MyAnno(str = "Применение", value = 100)
    public static void meMeth(int i, boolean ... booleans){

    }

    public static void meth1(){
        int i = 1, j = 2, q = 1;
        int k = i + 10 * i++ - j * 5 + --j;
        int b = q + q++;
        System.out.println(i);
        System.out.println(k);
        System.out.println(b);
    }

    public static int meth2(){
        return 10;
    }

    public static void meth3(){
        Gen<?>[] gen = new Gen<?>[]{
                new Gen<>(10),
                new Gen<>("Test"),
                new Gen<>(false),
        };




        for(int i = 0; i < gen.length; i++){
            System.out.println(gen[i].getob());
        }

    }

    public static void meth4(){
        Test t = new Test();
        System.out.println(String.valueOf(t));
    }

    public static void  meth5(){

        System.out.println(Integer.toBinaryString(1234));
    }

    public static void meth6(){
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

    }

    public static void meth7(){
        // HH - 24 часовой формат
        // hh - 12 часовой формат
        // mm - минуты
        // ss - секунды
        // yyyy - год
        // MM - месяц
        // dd - день
        String timeStamp = new SimpleDateFormat("HH:mm, dd/MM/yyyy").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

    }

    public static void meth8(){
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble(), second = sc.nextDouble();
        System.out.println(Math.abs(first - second) < 0.000001 ? "числа равны" : "числа не равны");
    }

    public static void meth9(){
        String bytes[] = {
                "01110011",
                "01110100",
                "01100101",
                "01110000",

                "00101100",

                "01111001",
                "01101111",
                "01110101",

                "01101101",
                "01111001",

                "01100010",
                "01100101",
                "01110011",
                "01110100"
        };
        System.out.println(BinaryCoder.decode(bytes));
    }
}
