package batterfeed.Threads.ProdCon;

public class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
