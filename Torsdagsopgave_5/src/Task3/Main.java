package Task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 4, 3);
        Room room2 = new Room(3, 6, 30);
        Room room3 = new Room(6, 20, 1);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building office = new Building(rooms, 2, 30, true);

        System.out.println("The total number of lamps: " + countLampsInBuilding(office));

        System.out.println(isNormal(office));
    }

    private static int countLampsInBuilding(Building office) {
        int totalLamps = 0;
        for (Room room : office.getRooms()) {
            totalLamps += room.getNumberOfLamps();

        }
        return totalLamps;
    }
    private static boolean isNormal(Building office) {
        if (office.getNumberOfFloors() >= office.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
