package SingleRoom;

public class RoomSize {
    public RoomSize(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void getArea(){
        System.out.println("Area of the room length * width");
    }

    private int height;
    private int width;
    private int length;
}
