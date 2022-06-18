package academy.learnprogramming.Composition_Encapsulation_Polymorphism;

public class Room {

    private Walls theWalls;
    private Floor theFloor;
    private Table theTable;

    public Room(Walls theWalls, Floor theFloor, Table theTable) {
        this.theWalls = theWalls;
        this.theFloor = theFloor;
        this.theTable = theTable;
    }

    public void anger() {
        theTable.flip();
        System.out.println("You got mad and flipped the table.");
    }
}
