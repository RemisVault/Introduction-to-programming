import java.util.Scanner;


public class ExponentMethod 
{
    public static double result(int base, double exponent) 
    {
        double result;
        result = Math.pow(base, exponent);
        return result;

    }


    public static void main(String []args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int base;
        double exponent;

        System.out.print("Introduce the base value: ");
        base = keyboard.nextInt();
        
        System.out.print("Introduce the exponent: ");
        exponent = keyboard.nextDouble();

        while (exponent < 0) 
        {
            System.out.print("The value of the exponent must be greater or equal than 0. Try again: ");
            exponent = keyboard.nextDouble();
        } 
        
        keyboard.close();

        System.out.printf("The value of the operation is %.2f", result(base, exponent));
    }


}