package Object_Oriented_Thinking;

public class Time
{
    // Attributes of a Time Object.
    private long hours, minutes, seconds;

    /**
     * Instantiates a time Object using the elapsed time from the currentTimeMillis method in the System class.
     */
    public Time()
    {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        this.hours = currentHour;
        this.minutes = currentMinute;
        this.seconds = currentSecond;
    }

    /**
     * This creates a time Object using a specified elapsed time from Jan. 1,1970 in milliseconds.
     * @param elapsedTimeMillis The elapsed time in milliseconds from Jan. 1, 1970.
     */
    public Time(long elapsedTimeMillis)
    {
        long totalSeconds = elapsedTimeMillis / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        this.hours = currentHour;
        this.minutes = currentMinute;
        this.seconds = currentSecond;
    }

    /**
     * Instantiates a Time Object with a specified hour, minute and second.
     * @param hours The number of hours passed.
     * @param minutes The number of minutes passed.
     * @param seconds The number of seconds passed.
     */
    public Time(long hours, long minutes, long seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * This returns the number of hours elapsed.
     *
     * @return The number of hours elapsed.
     */
    public long getHours()
    {
        return this.hours;
    }

    /**
     * This returns the number of minute elapsed.
     *
     * @return The number of minute elapsed.
     */
    public long getMinutes()
    {
        return this.minutes;
    }

    /**
     * This returns the number of seconds elapsed.
     *
     * @return The number of seconds elapsed.
     */
    public long getSeconds()
    {
        return this.seconds;
    }

    /**
     * This sets a new time for the Object using the time
     * @param elapsedTime
     */
    public void setTime(long elapsedTime)
    {
        long totalSeconds = elapsedTime / 1000;
        this.seconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        this.minutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        this.hours = totalHours % 24;
    }
}
