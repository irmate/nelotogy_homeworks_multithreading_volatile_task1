public class ThreadToy extends Thread {
    final int TIME_BEFORE_TURN_OFF = 1000;

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                while (Main.button) {
                    Thread.sleep(TIME_BEFORE_TURN_OFF);
                    Main.button = false;
                    System.out.println("Button is turn OFF");
                }
            }
        } catch (InterruptedException ignored) {
        } finally {
            System.out.println("Game over");
        }
    }
}