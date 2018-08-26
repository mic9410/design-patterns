package builder.end;

public class HorizontalBuilder implements CounterBuilderInterface {
    private String font;
    private String buttonColor;
    private String backgroundColor;
    private ButtonCounter counter = ButtonCounter.COUNTER_INSTANCE;

    @Override
    public void getCounterInfo() {
        System.out.println("Liczba kliknięć to: " + counter.display());
    }

    @Override
    public void click() {
        this.counter.click();
    }

    @Override
    public CounterBuilderInterface setButtonFont() {
        this.font = "Times New Roman";
        System.out.println("Moja czcionka to: " + this.font);
        return this;
    }

    @Override
    public CounterBuilderInterface setButtonColor() {
        this.buttonColor = "czorny";
        System.out.println("Moj kolor przycisku to: " + this.buttonColor);
        return this;
    }

    @Override
    public CounterBuilderInterface setBackgroundColor() {
        this.backgroundColor = "zielony";
        System.out.println("Moj kolor tła to: " + this.backgroundColor);
        return this;
    }

    @Override
    public CounterBuilderInterface getName() {
        System.out.println("Cześć, jestem układem poziomym!");
        return this;
    }

}
