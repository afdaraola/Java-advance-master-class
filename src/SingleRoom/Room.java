package SingleRoom;

public class Room {

    public Room(SingleRoom singleRoom, RoomSize roomSize) {
        this.singleRoom = singleRoom;
        this.roomSize = roomSize;
    }

    public SingleRoom getSingleRoom() {
        return singleRoom;
    }

    public RoomSize getRoomSize() {
        return roomSize;
    }

    private SingleRoom singleRoom;
    private RoomSize roomSize;



    public void howBigRoom(){
        roomSize.getArea();
    }

    public void Roomfutures(){
        singleRoom.carpet = "Brown";
        System.out.println("singleRoom.carpet "+ singleRoom.carpet);
    }
}
