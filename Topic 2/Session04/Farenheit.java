import java.util.Scanner;

public class Farenheit {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double farenheit, celsius; 
        System.out.print("Introduce the value in Farenheit you want to convert to Celsius: ");
        farenheit = keyboard.nextDouble();
        celsius = (farenheit - 32) * 5 / 9;
        System.out.printf("The value in celsius is %.1f\n" , celsius);

        keyboard.close();
    }
    
}
