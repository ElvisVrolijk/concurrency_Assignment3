import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by e_voe_000 on 9/30/2016.
 */
public class Hiswa {

    Lock lock;

    //number of viewers allowed inside
    private static final int NR_VIEWERS_ALLOWED_IN = 10;
    private static final int NR_BUYERS_ALLOWED_IN = 1;


    //viewers wating
    private int viewersWaitingCount = 0;
    //buyers wating
    private int buyersWaitingCount = 0;
    //boolean buyers inside
    private int buyerInside = 0;
    //buyercount for after 4 buyers went in
    private int buyerCount = 0;
    //count viewers inside
    private int viewersInside = 0;
    //conditions
    private Condition viewerEnter, buyerEnter, viewersLeave, buyersLeave, entranceAvailable;


    public Hiswa() {
        //all locks
        lock = new ReentrantLock();
        viewerEnter = lock.newCondition();
        buyerEnter = lock.newCondition();
        //viewersLeave = lock.newCondition();
        //buyersLeave = lock.newCondition();
        //entranceAvailable = lock.newCondition();
    }

    public void entranceViewer() {
        lock.lock();
        try {
            viewersWaitingCount++;
            //if the hiswa is not full
            while (viewersInside == 10 || buyersWaitingCount > 0)
                viewerEnter.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        //are there 10 viewers inside, if not allow more viewers in
        //if 4 buyers have entered consecutive, viewers are allowed in

    }

    public void entranceBuyer() {
        lock.lock();
        try {
            buyersWaitingCount++;
            while (buyerInside >= 1) {
                buyerEnter.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public void exitViewer() {
        lock.lock();
        try {
            viewersInside--;
            viewerEnter.signal();
        }finally {
            lock.unlock();
        }
    }

    public void exitBuyer() {
        lock.lock();
        try {
            buyerInside--;
            //buyer count is the 4 buyers at max
            buyerCount++;
            buyerEnter.signal();
        }finally {
            lock.unlock();
        }
    }

    public void viewingBoats() throws InterruptedException {


    }

    public Viewer nextViewer() {

        //returns viewer
    }


}


























