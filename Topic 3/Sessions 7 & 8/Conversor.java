import java.util.Scanner;

public class Conversor {

    public static double conversion(int option, double value){
        final double MILES_TO_KM = 1.60934;
        final double METERS_TO_YARDS = 1.09361;
        final double POUNDS_TO_KG = 0.453592;

        if (option == 1) {
            return value * MILES_TO_KM;
        } else if (option == 2) {
            return value * METERS_TO_YARDS;
        } else if (option == 3) {
            return value * POUNDS_TO_KG;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double value;
        int option;

        System.out.print("Pick your converter: \n1) Miles to km\n 2) Meters to yards\n 3) Pounds to kg\nOption? (Specify a number): ");
        option = keyboard.nextInt();  
        
        System.out.print("Introduce a value: ");
        value = keyboard.nextDouble(); 
        
        System.out.print(conversion(option, value));
        
        keyboard.close();
    }
}
