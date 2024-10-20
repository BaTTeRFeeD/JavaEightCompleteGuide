package batterfeed.Threads.SuspendResume;

public class NewThread implements Runnable{
    public String name;
    public Thread t;
    boolean suspendFlag;

    public NewThread(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i=15; i>0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e){
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " is complete.");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
