public class ThreadToy extends Thread {
    final int TIME_BEFORE_TURN_OFF = 1000;
    Toy toy;

    public ThreadToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                while (toy.isButton()) {
                    Thread.sleep(TIME_BEFORE_TURN_OFF);
                    toy.setButton(false);
                    System.out.println("Button is turn OFF");
                }
            }
        } catch (InterruptedException ignored) {
        } finally {
            System.out.println("Game over");
        }
    }
}