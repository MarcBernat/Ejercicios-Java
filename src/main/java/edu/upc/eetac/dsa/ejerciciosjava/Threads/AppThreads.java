package edu.upc.eetac.dsa.ejerciciosjava.Threads;

/**
 * Created by marc on 30/09/15.
 */
public class AppThreads {
    public static void main(String[] args) throws InterruptedException {
        ClassThread threadClass = new ClassThread("thread class");
        Thread thread = new Thread(new ClassRunnable(), "runnable class");
        threadClass.start();
        thread.start();

        /**Se espera que se los threads terminen*/
        threadClass.join();
        thread.join();

        System.out.println("Se acabó.");
    }

}
