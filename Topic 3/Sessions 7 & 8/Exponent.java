import java.util.Scanner;

public class Exponent 

{

    public static void main(String []args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double base;
        double exponent;
        double result;
        
        System.out.print("Introduce the base value: ");
        base = keyboard.nextDouble();
        
        System.out.print("Introduce the exponent: ");
        exponent = keyboard.nextDouble();

        while (exponent < 0) 
        {
            System.out.print("The value of the exponent must be greater or equal than 0. Try again: ");
            exponent = keyboard.nextDouble();
        } 
        
        keyboard.close();

        result = Math.pow(base, exponent);
        System.out.printf("The value of the operation is %.2f", result);
    }

}