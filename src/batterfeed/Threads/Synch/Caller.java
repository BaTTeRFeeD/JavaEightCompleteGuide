package batterfeed.Threads.Synch;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String msg){
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
