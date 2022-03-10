public class Toy {
    private volatile boolean button;

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }
}