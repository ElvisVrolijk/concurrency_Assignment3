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
        viewersLeave = lock.newCondition();
        buyersLeave = lock.newCondition();
        entranceAvailable = lock.newCondition();
    }

    public boolean entrance() {

        //if the hiswa is not full
        if (viewersInside != NR_VIEWERS_ALLOWED_IN) {
            //are there 10 viewers inside, if not allow more viewers in

        }

        if (buyerInside != NR_BUYERS_ALLOWED_IN) {
        }

        //if 4 buyers have entered consecutive, viewers are allowed in
        if (buyerCount >= 4) {
            //viewers can go in
        }


    }

    public void viewingBoats() throws InterruptedException {

        //firs thread to repport arrival goes in
        //if this is a viewer, more can go in (till 10)
        //if this is a buyer, only he can go in

        while ()

        //viewers in line
        //viewer entering
        //viewers inside
        //viewer leaving

        //buyer in line
        //buyer enters
        //buyer buys --> pays
        //buyer leaves

    }

    public Viewer nextViewer() {

        //returns viewer
    }


}


























