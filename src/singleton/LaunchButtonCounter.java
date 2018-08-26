package singleton;

public class LaunchButtonCounter {

    public static void main(String[] args) {
        ButtonCounter horizontal = ButtonCounter.COUNTER_INSTANCE;
        horizontal.setHorizontal(true);
        horizontal.click();
        horizontal.click();
        horizontal.click();
        horizontal.display();
        ButtonCounter vertical = ButtonCounter.COUNTER_INSTANCE;
        horizontal.setHorizontal(false);
        vertical.click();
        vertical.click();
        vertical.click();
        vertical.click();
        vertical.click();
        vertical.click();
        vertical.click();
        vertical.click();
        vertical.display();
    }
}
