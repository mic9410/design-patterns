package builder.end;

public class LaunchButtonCounter {

    public static void main(String[] args) {
        CounterDirector counterDirector = new CounterDirector();
        VerticalBuilder vertical = new VerticalBuilder();
        HorizontalBuilder horizontal = new HorizontalBuilder();

        CounterBuilderInterface ui = counterDirector.setUI(vertical);
        ui.click();
        ui.click();
        ui.click();
        ui.click();
        ui.getCounterInfo();
        ui = counterDirector.setUI(horizontal);
        ui.click();
        ui.click();
        ui.click();
        ui.click();
        ui.click();
        ui.click();
        ui.click();
        ui.getCounterInfo();
    }
}
