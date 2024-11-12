package synchronizationAndLockconcept;

public class Counter {
    private int count = 0;

    //by synchronized keyword
/*
    public synchronized void increment() {
        count++;
    }
*/

    //by synchronized block
   /* public void increment() {
        synchronized (this) {
            count++;
        }
    }*/

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}
