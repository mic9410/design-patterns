package builder.end;

public interface CounterBuilderInterface {
    CounterBuilderInterface setButtonFont();
    CounterBuilderInterface setButtonColor();
    CounterBuilderInterface setBackgroundColor();
    CounterBuilderInterface getName();
    void getCounterInfo();
    void click();
}
