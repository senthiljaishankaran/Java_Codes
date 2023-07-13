package Multithreading;

public class ThreadStart extends Thread {
    public void run(){
        System.out.println("Thread is Started and Running");
    }
    public static void main(String[] args) {
     ThreadStart ts=new ThreadStart();
     ts.start();
    }
}
