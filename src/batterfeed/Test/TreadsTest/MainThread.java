package batterfeed.Test.TreadsTest;

public class MainThread {
    public static void main(String[] args) {
        AdditionThread at = new AdditionThread();
        at.start();
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("MainThread: " + i);
                Thread.sleep(1000);
                if(i == 3) at.notify();
            }
        } catch (InterruptedException e){}
        System.out.println("main end");
    }
}
