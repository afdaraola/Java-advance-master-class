package SingleRoom;

public class Main {
    public static void main(String[] args) {

        SingleRoom singleRoom = new SingleRoom("Blue","LG","OX","Foreign",new Furnitures("bleu",false,"10","Yes"));
        RoomSize  roomSize = new RoomSize(3,4,5);
        Room room = new Room(singleRoom,roomSize);

        room.howBigRoom();
        room.Roomfutures();
    }
}
