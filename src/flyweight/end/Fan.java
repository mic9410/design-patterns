package flyweight.end;

public class Fan {

    public Fan(String club) {
        String supportedClub = club;
        FanKit fanKit = new FanKit(supportedClub);
    }
}
