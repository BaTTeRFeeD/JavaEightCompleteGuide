package batterfeed.Test.TreadsTest.JoinTest;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException{
        Thread1 thread1 = new Thread1();
        thread1.start();


        Thread.sleep(4000);

        thread1.interrupt();
        thread1.join();
        System.out.println("end");
    }
}
