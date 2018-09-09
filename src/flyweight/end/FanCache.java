package flyweight.end;

import java.util.HashMap;
import java.util.Map;

public class FanCache {

    private static Map<String, Fan> cache = new HashMap<>();

    public static Fan getFan(String supportedTeam){
        Fan fan = cache.get(supportedTeam);

        if(fan == null){
            fan = new Fan(supportedTeam);
            cache.put(supportedTeam, fan);
        }
        return fan;
    }
}
