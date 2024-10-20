package batterfeed.Threads.Synch;

public class Synch {
    public static void main(String[] args){
        Callme target = new Callme();


        try {
            Caller ob1 = new Caller(target, "Добро пожаловать");
            Thread.sleep(500);
            Caller ob2 = new Caller(target, "в синхронизированный");
            Thread.sleep(500);
            Caller ob3 = new Caller(target, "мир!");


            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted!");
        }
    }
}