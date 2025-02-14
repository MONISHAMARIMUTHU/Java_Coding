package Composition;

class Room {
    
    void open(){
        System.out.println("Room is opened");
    }
}
class House {
    private final Room room; // Composition

    House(){
        this.room = new Room(); // room is creted with house -> if house is destroyed room is also destroyed
    }

    void openHouse(){
        System.out.println("House is opened");
        room.open();
    }
}

public class house_eg {
    public static void main(String[] args) {
        House house = new House();
        house.openHouse();
    }
}

