package flyweight.end;

public class Fan {

    public Fan(Club club) {
        Club supportedClub = club;
        FanKit fanKit = new FanKit(supportedClub);
    }
}
