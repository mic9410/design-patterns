package flyweight.start.ConcreteFan;

import flyweight.start.Fan;

public class WislaFan implements Fan {
    @Override
    public void getShirt() {
        System.out.println("czerwono-biały");
    }
@Override
    public void screamShout() {
        System.out.println("Hej Wisła Gol!");
    }
@Override
    public void showBanner() {
        System.out.println("Wisła Kraków");
    }

}
