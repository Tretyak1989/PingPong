/**
 * Created by Андрей on 10.12.2016.
 */
public class Realisation {
    public static void main(String[] args) {

        PingPong pp = new PingPong();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pp.doPing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pp.doPong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
