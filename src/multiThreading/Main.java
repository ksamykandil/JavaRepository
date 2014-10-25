package multiThreading;
/**
 * Created by ksamykandil on 8/23/14.
 */
public class Main {
    public static void main(String[] args){
        RunnableDemo r1 = new RunnableDemo("Runnable1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Runnable2");
        r2.start();

        ThreadDemo t1 = new ThreadDemo("Thread1");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread2");
        t2.start();
    }
}