package builder.start;

public enum ButtonCounter {

    COUNTER_INSTANCE;

    private boolean horizontal;
    private int counter = 0;

    public void display() {
        if (isHorizontal()) {
            System.out.println("Telefon jest poziomo - tło ustawiono na zielone.");
        } else {
            System.out.println("Telefon jest pionowo - tło ustawiono na czerwone.");
        }
        System.out.println("Liczba kliknięć to: " + this.getCounter());
    }

    private boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    private int getCounter() {
        return counter;
    }

    public void click() {
        System.out.println("Klik!");
        this.counter++;
    }
}
