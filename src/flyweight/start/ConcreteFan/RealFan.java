package flyweight.start.ConcreteFan;

import flyweight.start.Fan;

public class RealFan implements Fan {

    @Override
    public void getShirt() {
        System.out.println("biały");
    }
    @Override
    public void screamShout() {
        System.out.println("Hala Madrid!");
    }
    @Override
    public void showBanner() {
        System.out.println("Real Madrid CF");
    }

}
