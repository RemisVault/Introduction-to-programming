import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        double weight, height2, bodymass;

        System.out.print("To calculate the Body Mass Index, first introduce the weight: ");
        weight = keyboard.nextDouble();

        System.out.print("Now introduce the height: ");
        height2 = keyboard.nextDouble();

        bodymass = weight / Math.pow(height2, 2);
        System.out.printf("The body mass equals %.2f" , bodymass);

        keyboard.close();
    }
}
