import java.util.Scanner;

/**
 * Program that converts a distance from miles to kilometres using keyboard input.
 */
public class Converter
{
    /**
     * Runs the complete solution for this exercise.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        final double MILE_TO_KM = 1.609344;
        double miles, kilometres;

        System.out.print("Give me the distance in miles: ");
        miles = keyboard.nextDouble();

        kilometres = miles * MILE_TO_KM;

        System.out.printf("The distance in kilometres is: %g\n", kilometres);
    }
}
