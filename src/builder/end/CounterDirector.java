package builder.end;

public class CounterDirector {
    public CounterBuilderInterface setUI(CounterBuilderInterface builder) {
        return builder.getName()
                .setBackgroundColor()
                .setButtonColor()
                .setButtonFont();
    }
}
