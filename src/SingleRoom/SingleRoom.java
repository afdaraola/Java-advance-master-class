package SingleRoom;

public class SingleRoom {

    public SingleRoom(String colour, String television, String fan, String carpet, Furnitures furnitures) {
        this.colour = colour;
        Television = television;
        this.fan = fan;
        this.carpet = carpet;
        this.furnitures = furnitures;
    }


    public String getColour() {
        return colour;
    }

    public String getTelevision() {
        return Television;
    }

    public String getFan() {
        return fan;
    }


    public Furnitures getFurnitures() {
        return furnitures;
    }

    private String colour;
    private String Television;
    private String fan;
    public String carpet;
    private Furnitures furnitures;
}
