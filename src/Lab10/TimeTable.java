package Lab10;

public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9;
    private ClassDetails[][] grid;

    private String[] days =
            {
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday"
            };

    private String[] hours =
            {
                    "9:00",
                    "10:00",
                    "11:00",
                    "12:00",
                    "13:00",
                    "14:00",
                    "15:00",
                    "16:00",
                    "17:00"
            };

    public TimeTable()
    {
        grid = new ClassDetails[DAYS][HOURS];
    }

    public void set(int day, int hour, ClassDetails details)
    {
        grid[day][hour] = details;
    }

    public void display()
    {
        //Print headings
        System.out.printf("%20s", "");
        for (int i = 0; i < days.length; i++)
        {
            System.out.printf("%20s", days[i]);
        }
        System.out.println();

        //Print hours and class details
        for(int i = 0; i < HOURS; i++)
        {
            System.out.printf("%20s", hours[i]);

            for(int j = 0; j < DAYS; j++)
            {
                System.out.printf("%20s", grid[i][j]);
            }

            System.out.println("\n");
        }
    }

    public ClassDetails get(int day, int hour)
    {
        return null;
    }

    public int getNumberOfClassesFor(String name)
    {
        return 0;
    }

    public int getNumberOfFreeSlots()
    {
        return 0;
    }


}
