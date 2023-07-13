package Multithreading;

public class RunnableThread implements Runnable {
    public void run(){
        System.out.println("Thread is Started and Running");
    }
    public static void main(String[] args) {
        RunnableThread rt=new RunnableThread();
        Thread ts1=new Thread(rt);
        ts1.start();

    }
}
