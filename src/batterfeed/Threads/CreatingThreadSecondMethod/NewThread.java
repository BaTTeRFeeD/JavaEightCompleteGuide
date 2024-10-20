package batterfeed.Threads.CreatingThreadSecondMethod;

public class NewThread extends Thread{
    NewThread(){
        super("Demonstration thread");
        System.out.println("Child thread: " + this );
        start();
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
