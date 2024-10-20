package batterfeed.Test;

public class Test3 {
    public static void main(String[] args) {
        new Test3().new B();
    }

    class A{
        String str = "ab";
        A(){
            printLength();
        }
        void printLength(){
            System.out.println(str.length());
        }
    }
    class B extends A{
        String str = "abc";
        B(){
            printLength();
        }
        void printLength(){
            System.out.println(str.length());
        }
    }
}
