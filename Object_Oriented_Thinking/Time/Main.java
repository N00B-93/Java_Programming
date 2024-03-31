package Object_Oriented_Thinking.Time;

import java.util.ArrayList;

/*
    This is a program that creates 3 Time Objects using the constructors available in the Time class and then displays
    the current time for each Object in the format hh:mm:ss.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Time Object using the Time class no-arg constructor.
        Time time1 = new Time();

        // Creates a Time Object by specifying the elapsed time since Jan. 1, 1970.
        Time time2 = new Time( 555550000);

        // Creates a Time Object by specifying the hours, minutes and seconds.
        Time time3 = new Time(5, 23, 55);

        // Creates an ArrayList to store the time Objects.
        ArrayList<Time> times = new ArrayList<>();

        // Adds the time Objects to the list.
        times.add(time1);
        times.add(time2);
        times.add(time3);

        // Displays the current time of each Time Object.
        for (Time time: times)
        {
            System.out.printf("\nCurrent Time: %d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        }
    }
}
