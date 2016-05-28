package thread;

/**
 * Created by baohg on 5/28/16.
 */

class PrintDemo {
    public void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter   ---   " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}


class ThreadWithoutSynchronize extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    ThreadWithoutSynchronize( String name,  PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run() {
        PD.printCount();
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start ()
    {
        System.out.println("Starting " +  threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}

class ThreadWithSynchronize extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    ThreadWithSynchronize( String name,  PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run() {
        synchronized(PD) {
            PD.printCount();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start ()
    {
        System.out.println("Starting " +  threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}

public class Synchronize {
    public static void doWithoutSynchronize(){
        PrintDemo PD = new PrintDemo();
        ThreadWithoutSynchronize T1 = new ThreadWithoutSynchronize( "Thread - 1 ", PD );
        ThreadWithoutSynchronize T2 = new ThreadWithoutSynchronize( "Thread - 2 ", PD );
        T1.start();
        T2.start();
        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }
    }

    public static void doWithSynchronize(){
        PrintDemo PD = new PrintDemo();
        ThreadWithSynchronize T1 = new ThreadWithSynchronize( "Thread - 1 ", PD );
        ThreadWithSynchronize T2 = new ThreadWithSynchronize( "Thread - 2 ", PD );
        T1.start();
        T2.start();
        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String args[]) {
//        doWithSynchronize();
        doWithoutSynchronize();
    }

}
