package MultiThreading;
/**
 * Created by ksamykandil on 8/23/14.
 *
 * Create thread through implementing Runnable Interface.
 */
public class RunnableDemo implements Runnable{
    private Thread thread;

    RunnableDemo(String threadName){
        /**
         * If you didn't set "this" keyword in creating the new Thread, it won't call Run method of this class.
         */
        this.thread = new Thread(this, threadName);
        System.out.println("Creating Thread " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running Thread " + thread.getName());

        try {
            // Do Some Operation
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + thread.getName() + " " + i);
                Thread.sleep(200);
            }
        }catch(InterruptedException e){
            System.out.println("Thread " + thread.getName() + " Interrupted");
        }
    }

    public void start(){
        System.out.println("Starting Thread " + thread.getName());
        thread.start();
    }
}
