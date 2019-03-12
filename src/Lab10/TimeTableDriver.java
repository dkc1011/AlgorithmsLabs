package Lab10;

public class TimeTableDriver {
    public static void main(String[] args) {
        TimeTable timeTable = new TimeTable();
        timeTable.set(0,1, new ClassDetails("Algorithms", "T302"));
        timeTable.set(0,4, new ClassDetails("LAN Switching", "R200"));
        timeTable.set(0,6, new ClassDetails("Games Dev", "S300"));
        timeTable.set(1, 2, new ClassDetails("Games Dev", "S300"));
        timeTable.set(1, 4, new ClassDetails("Algorithms", "T302"));
        timeTable.set(2, 1, new ClassDetails("LAN Switching", "R200"));
        timeTable.set(2,3, new ClassDetails("Algorithms", "T302"));
        timeTable.set(3,4, new ClassDetails("LAN Switching", "R200"));
        timeTable.set(3,7, new ClassDetails("Games Dev", "S300"));
        timeTable.set(4, 1, new ClassDetails("Games Dev", "S300"));
        timeTable.set(4, 3, new ClassDetails("Algorithms", "T302"));
        timeTable.set(4, 7, new ClassDetails("LAN Switching", "R200"));


        timeTable.display();
    }
}
