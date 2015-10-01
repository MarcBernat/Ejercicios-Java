package edu.upc.eetac.dsa.ejerciciosjava.Threads;

/**
 * Created by marc on 30/09/15.
 */
public class ClassThread extends Thread {
    long ultimaExecution = 0;
    int counter = 0;

    public ClassThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            long currentExecution = System.currentTimeMillis();
            long elapsed = (ultimaExecution == 0) ? 0 : currentExecution - ultimaExecution;
            ultimaExecution = currentExecution;
            System.out.println(getName() + " elapsed = " + elapsed + " ms. [" + (++counter) + "]");
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
