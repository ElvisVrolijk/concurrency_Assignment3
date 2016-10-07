/**
 * Created by Remy on 30-9-2016.
 */
public class World {

    //there is no max amount of viewers, 10 are allowed inside but there is no actual max
    private static final int NR_OF_VIEWERS = 50;
    //no max buyers but for testing purposes
    private static final int NR_OF_BUYERS = 10;

    public static void main(String[] args) {
        Hiswa hiswa = new Hiswa();
        Thread[] viewer;
        Thread[] buyer;
        viewer = new Thread[NR_OF_VIEWERS];
        buyer = new Thread[NR_OF_BUYERS];

        //start the viewer threads and give them a number
        for (int i = 0; i < NR_OF_VIEWERS; i++) {
            viewer[i] = new Viewer("Viewer" + i, hiswa);
            viewer[i].start();
        }

        //start the buyer threads and give them a number
        for (int i = 0; i < NR_OF_BUYERS; i++) {
            buyer[i] = new Buyer("Buyer" + i, hiswa);
            buyer[i].start();
        }
    }
}
