public class ThreadUser extends Thread {
    @Override
    public void run() {
        Main.button = true;
        System.out.println("Button is turn ON");
    }
}