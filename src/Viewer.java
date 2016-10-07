/**
 * Created by Remy on 30-9-2016.
 */
public class Viewer extends Thread {

    private Hiswa hiswa;

    public Viewer(String name, Hiswa hiswa) {
        super(name);
        this.hiswa = hiswa;
    }

    @Override
    public void run() {
        while (true) {
            //the code
            justLive();

            hiswa.entranceViewer();
            viewersView();
            hiswa.exit();
        }
    }

    private void justLive() {
        try {
            System.out.println(getName() + " living");
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }

    }

    private void viewersView(){
        try {
            System.out.println(getName() + " viewing the boats");
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
    }

    public String getViewerName() {
        return getName();
    }

}
