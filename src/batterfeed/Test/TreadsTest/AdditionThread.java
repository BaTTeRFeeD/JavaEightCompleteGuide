package batterfeed.Test.TreadsTest;

public class AdditionThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("AddThread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){

        }
    }
}
