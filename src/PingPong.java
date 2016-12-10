/**
 * Created by Андрей on 10.12.2016.
 */
public class PingPong {

    public final static int PING = 0;
    public final static int PONG = 1;
    private int state = 0;

    public synchronized void doPing() throws InterruptedException {

        while (true) {
            if (state == PING) {
                wait();
            }
            state = PING;
            System.out.println("Ping");

            notify();
        }
    }

    public synchronized void doPong() throws InterruptedException {

        while (true){
            if (state == PONG) {
                wait();
            }
            state = PONG;
            System.out.println("Pong");

            notify();
        }
    }

}
