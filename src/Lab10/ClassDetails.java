package Lab10;

public class ClassDetails {
    private String name; //e.g Algorithms
    private String roomNumber; //e.g R203

    ClassDetails()
    {
         name = "";
         roomNumber = "";
    }

    ClassDetails(String name, String roomNumber)
    {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return getName() + getRoomNumber();
    }
}
