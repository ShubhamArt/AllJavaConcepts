package synchronizationAndLockconcept;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;
    //instead of using in built synchronization or locks we are creating our own loack
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" Attempting to withdraw "+amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+"proccessing with withdrawl");
                        Thread.sleep(3000);
                        balance =balance-amount;
                        System.out.println(Thread.currentThread().getName() + "Completed withdrawl. Remaining balance :"+balance);
                    }catch (Exception e){
                        //RESTORING THE STATE OF THREAD
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName()+" Insufficient balance ");
                }
            }else{
                System.out.println("Coould not acquire the lock . please try again later ");
            }
        } catch (Exception e) {
            //RESTORING THE STATE OF THREAD
          Thread.currentThread().interrupt();
        }

    }


}
