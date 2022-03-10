public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int TIME_BEFORE_TURN_ON = 3000;
        final int TIME_BEFORE_EXIT = 2000;
        Toy toy = new Toy();
        Thread[] arr = {
                new ThreadToy(toy),
                new ThreadUser(toy),
                new ThreadUser(toy),
                new ThreadUser(toy),
                new ThreadUser(toy),
                new ThreadUser(toy)
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