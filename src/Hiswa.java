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

    //viewers wating
    private int viewersWaitingCount = 0;
    //buyers wating
    private int buyersWaitingCount = 0;
    //boolean buyers inside
    private boolean buyerInside = false;
    //buyercount for after 4 buyers went in
    private int buyerCount = 0;
    //count viewers inside
    private int viewersInside = 0;
    //conditions
    private Condition viewerEnter, buyerEnter, viewersLeave, buyersLeave, entranceAvailable;


    public Hiswa(){
        //all locks
        lock = new ReentrantLock();
        viewerEnter = lock.newCondition();
        buyerEnter = lock.newCondition();
        viewersLeave = lock.newCondition();
        buyersLeave = lock.newCondition();
        entranceAvailable = lock.newCondition();
    }

    public Viewer nextViewer(){

        //returns viewer
    }

}


























