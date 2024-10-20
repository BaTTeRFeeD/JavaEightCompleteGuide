package batterfeed.Threads.DemoJoin;

import batterfeed.Threads.MultiThreadDemo.NewThread;

public class DemoJoin {
    public static void main(String[] args){
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread \"One\" is started: "
                + ob1.t.isAlive());
        System.out.println("Thread \"Two\" is started: "
                + ob2.t.isAlive());
        System.out.println("Thread \"Three\" is started: "
                + ob3.t.isAlive());

        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Thread One is starting: "
                + ob1.t.isAlive());
        System.out.println("Thread Two is starting: "
                + ob2.t.isAlive());
        System.out.println("Thread Three is starting: "
                + ob3.t.isAlive());

        System.out.println("Main thread is completed");
    }
}
