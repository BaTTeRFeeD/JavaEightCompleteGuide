package batterfeed.Test.TreadsTest.JoinTest;

public class Thread1 extends Thread{

    private int i = 0;

    @Override
    public void run() {
        try{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println(i++);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e){
            System.out.println("Interrupted.");
        } finally {
            System.out.println("Thread stopped.");
        }
    }


}
