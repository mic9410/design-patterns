package flyweight.start;

import java.util.ArrayList;
import java.util.List;

public class FanLauncher {

    public static void main(String[] args) {
        List allFans = new ArrayList();

        for (int i = 0; i < 200; ++i) {
            allFans.add(FanFactory.getBarcaFan());
        }

        for (int i = 0; i < 260; ++i) {
            allFans.add(FanFactory.getWislaFan());
        }
        FanFactory.getBarcaFan().screamShout();
        FanFactory.getWislaFan().screamShout();
    }
}
