public class Main {

    static volatile boolean button;

    public static void main(String[] args) throws InterruptedException {
        final int TIME_BEFORE_TURN_ON = 3000;
        final int TIME_BEFORE_EXIT = 2000;
        Thread[] arr = {
                new ThreadToy(),
                new ThreadUser(),
                new ThreadUser(),
                new ThreadUser(),
                new ThreadUser(),
                new ThreadUser()
        };

        for (int i = 0; i < 6; i++) {
            arr[i].start();
            Thread.sleep(TIME_BEFORE_TURN_ON);
        }
        arr[5].join();
        Thread.sleep(TIME_BEFORE_EXIT);
        arr[0].interrupt();
    }
}