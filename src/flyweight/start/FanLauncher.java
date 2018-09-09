package flyweight.start;

import java.util.ArrayList;
import java.util.List;

public class FanLauncher {

    public static void main(String[] args) {
        System.out.println("Let's start the game!");

        List<Fan> fans = new ArrayList<>();

        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.BARCA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));
        fans.add(new Fan(Club.WISLA.toString()));

        System.out.println("There is " + fans.size() + " people on the stadium.");
    }
}
