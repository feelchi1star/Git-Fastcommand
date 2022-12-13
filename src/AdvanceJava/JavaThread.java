package AdvanceJava;
import java.lang.Thread;
public class JavaThread extends Thread{
    public static void main(String[] args) {

        JavaThread thread = new JavaThread();
        thread.start();
        // Wait for the thread to finish
        if(thread.isAlive()) {
            System.out.println("Waiting...");
        }else {
            System.out.println("Loading");
        }
        System.out.println("This code is running in a thread");

    }

    public void print(){
        int x =400;
        int i=0;
        while (i < x){
            System.out.println(i);
            i++;
        }

    }
    public void run() {
        print();
        System.out.println("Finished");
    }
}
