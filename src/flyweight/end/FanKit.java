package flyweight.end;

public class FanKit {
    public String getShirt() {
        return shirt;
    }

    private String shirt;
    private String banner;

    public String getBanner() {
        return banner;
    }

    public String getScarf() {
        return scarf;
    }

    private String scarf;


    public FanKit(String supportedClub) {
        switch (supportedClub) {
            case "WISLA":
                getWislaKit();
            case "REAL":
                getRealKit();
            case "BARCA":
                getBarcaKit();
        }
    }

    private FanKit getBarcaKit() {
        this.banner = "Visca el Barca!";
        this.shirt = "red and violet";
        this.scarf = "FCB";
        return this;
    }

    private FanKit getRealKit() {
        this.banner = "Hala Madrid!";
        this.shirt = "white";
        this.scarf = "Real Madrid";
        return this;
    }

    private FanKit getWislaKit() {
        this.banner = "Hej Wisła gol!";
        this.shirt = "red and white";
        this.scarf = "Tylko Wisła";
        return this;
    }
}
