package flyweight.end;

import flyweight.start.FanKit;

import java.util.ArrayList;
import java.util.List;

public class FanLauncher {

    public static void main(String[] args) {
        System.out.println("Let's start the game!");

        List<Fan> tribunes = new ArrayList<>();

        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.BARCA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));
        tribunes.add(FanCache.getFan(Club.WISLA));

        System.out.println(tribunes);
        System.out.println("There is " + tribunes.size() + " people on the stadium.");
    }
}
