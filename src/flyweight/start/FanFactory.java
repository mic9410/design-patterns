package flyweight.start;

import flyweight.start.ConcreteFan.BarcaFan;
import flyweight.start.ConcreteFan.RealFan;
import flyweight.start.ConcreteFan.WislaFan;

import java.util.HashMap;

public class FanFactory {

    private static final HashMap fansMap = new HashMap();

    public static Fan getBarcaFan() {
        BarcaFan barcaFan = (BarcaFan) fansMap.get(FanTypes.BARCA);
        if (barcaFan == null) {
            barcaFan = new BarcaFan();
            fansMap.put(FanTypes.BARCA, barcaFan);
            return barcaFan;
        } else {
            return barcaFan;
        }
    }

    public static Fan getRealFan() {
        RealFan realFan = (RealFan) fansMap.get(FanTypes.REAL);
        if (realFan == null) {
            realFan = new RealFan();
            fansMap.put(FanTypes.REAL, realFan);
            return realFan;
        } else {
            return realFan;
        }
    }

    public static Fan getWislaFan() {
        WislaFan wislaFan = (WislaFan) fansMap.get(FanTypes.WISLA);
        if (wislaFan == null) {
            wislaFan = new WislaFan();
            fansMap.put(FanTypes.WISLA, wislaFan);
            return wislaFan;
        } else {
            return wislaFan;
        }
    }
}
