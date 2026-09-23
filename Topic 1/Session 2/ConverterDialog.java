import javax.swing.JOptionPane;

/**
 * Program that converts a distance from miles to kilometres using dialog boxes.
 */
public class ConverterDialog
{
    /**
     * Runs the complete solution for this exercise.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        final double MILE_TO_KM = 1.609344;

        String miles_string = JOptionPane.showInputDialog("Give me the distance in miles");

        double miles = Double.parseDouble(miles_string);
        double kilometres = miles * MILE_TO_KM;

        String output = String.format("The distance in kilometres is: %g", kilometres);

        JOptionPane.showMessageDialog(null, output);
    }
}
