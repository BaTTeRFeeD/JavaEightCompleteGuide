package batterfeed.JavaLangPackage.ThreadGroupDemo;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа А");
        ThreadGroup groupB = new ThreadGroup("Группа В");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupA);
        NewThread ob4 = new NewThread("Четыре", groupA);

        System.out.println("\nВывод из метода list()");
    }
}
