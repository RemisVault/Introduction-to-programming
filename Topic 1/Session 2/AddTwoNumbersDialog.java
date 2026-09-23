import javax.swing.JOptionPane;

/**
 * Program that adds two integer numbers entered with dialog boxes.
 */
public class AddTwoNumbersDialog
{
    /**
     * Runs the complete solution for this exercise.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        String num1_string = JOptionPane.showInputDialog("Give me the first integer");
        String num2_string = JOptionPane.showInputDialog("Give me the second integer");

        int n1 = Integer.parseInt(num1_string);
        int n2 = Integer.parseInt(num2_string);

        int result = n1 + n2;

        String output = String.format("The result is: %d", result);

        JOptionPane.showMessageDialog(null, output);
    }
}
