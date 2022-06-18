package academy.learnprogramming.Composition_Encapsulation_Polymorphism;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

        Walls theWalls = new Walls(8,10, "Blue");
        Floor theFloor = new Floor(10, 12);
        Table theTable = new Table("Granite");

        Room room = new Room(theWalls, theFloor, theTable);
        room.anger();
    }
}
