package Loops;

/*
    Radioactive decay of radioactive materials can be modeled by the equation A = A0e-t(log 2/h), where A is 
    the amount of the material at time t, A0 is the amount at time 0, and h is the half-life. Technetium-99 is a radioisotope that is used in imaging 
    of the brain. It has a half-life of 6 hours. This program displays the relative amount A / A0 in a patient body every hour for 24 
    hours after receiving a dose.
 */

public class RadioactiveDecay
{
    public static void main(String[] args)
    {
        // Half life of Technetium-99.
        final int HALF_LIFE = 6 * 3600;  // Converts the half life from hours to seconds.

        // Determines and displays the relative amount of Technetium-99 in the patients body every hour for 24 hrs.
        for (int time = 0; time <= 43200; time += 3600)
        {
            double relativeAmount = Math.exp(-time * Math.log(2.0) / HALF_LIFE);
            System.out.printf("\nAmount after %d seconds = %.2f\n", time, relativeAmount);
        }
    }
}