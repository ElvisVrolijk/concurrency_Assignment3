/**
 * Created by Remy on 30-9-2016.
 */
public class Buyer extends Thread {

    private Hiswa hiswa;

    public Buyer(String name, Hiswa hiswa) {
        super(name);
        this.hiswa = hiswa;
    }

    @Override
    public void run() {
        while (true) {
            //the code

        }

    }

    //buy
    private void buy() {
        try {
            System.out.println(getName() + " is buying a boat");
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getBuyerName(){
        return getName();
    }

}
