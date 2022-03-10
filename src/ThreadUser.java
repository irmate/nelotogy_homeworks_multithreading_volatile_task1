public class ThreadUser extends Thread {
    Toy toy;

    public ThreadUser(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        toy.setButton(true);
        System.out.println("Button is turn ON");
    }
}