package batterfeed.Threads.CreatingThread;

public class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this, "Demonstration thread");
        System.out.println("Child thread created: " + t );
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i=5; i>0; i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Child execution thread interrupted");
        }
        System.out.println("Child thread is complete.");
    }
}
