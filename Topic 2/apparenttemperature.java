import java.util.Scanner;

public class apparenttemperature {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double temperature, windspeed, siple, modern;

        System.out.print("To calculate the apparent temperature, introduce the temperature: ");
        temperature = keyboard.nextDouble();

        System.out.print("Now introduce the windspeed: ");
        windspeed = keyboard.nextDouble();

        siple = -0.04544 * (10.45 + 10 * Math.sqrt(windspeed) - windspeed) * (33 - temperature) + 33;
        modern = 13.12 + 0.6215 * temperature + (0.3965 * temperature - 11.37) * Math.pow(windspeed, 0.16);

        System.out.printf("The apparent temperature using Siple's approach is %.1f\n" , siple);
        System.out.printf("The apparent temperature using the modern approach is %.1f\n" , modern);

        keyboard.close();
    }
}