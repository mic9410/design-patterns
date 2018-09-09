package flyweight.start.ConcreteFan;

import flyweight.start.Fan;

public class BarcaFan implements Fan {

    @Override
    public void getShirt() {
        System.out.println("czerwono-fioletowy");
    }

    @Override
    public void screamShout() {
        System.out.println("Visca el Barca");
    }

    @Override
    public void showBanner() {
        System.out.println("FC Barcelona");
    }

}
