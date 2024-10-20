package batterfeed.Threads.Deadlock;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();
    public static void main(String[] args){
        new Deadlock();
    }

    Deadlock(){
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);

        System.out.println("Назад в другой поток");
    }
}
