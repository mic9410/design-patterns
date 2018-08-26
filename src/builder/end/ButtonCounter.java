package builder.end;

public enum ButtonCounter {

    COUNTER_INSTANCE;

    private int counter = 0;

    public int display() {
        return this.getCounter();
    }

    private int getCounter() {
        return counter;
    }

    public void click() {
        System.out.println("Klik!");
        this.counter++;
    }
}
