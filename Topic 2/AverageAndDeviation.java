import java.util.Scanner;

public class AverageAndDeviation {
    public static void main (String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int x, w, y, z;  
    double mean, deviation; 
    
    System.out.println("Introduce a value for x: ");
    x = keyboard.nextInt();
    System.out.println("Introduce a value for w: ");
    w = keyboard.nextInt();
    System.out.println("Introduce a value for y: ");
    y = keyboard.nextInt();
    System.out.println("Introduce a value for z: ");
    z = keyboard.nextInt();

    mean = (x + w + y + z) / 4.0;
    deviation = Math.sqrt((Math.pow((x - mean), 2.0) + Math.pow((w - mean), 2.0) +
                           Math.pow((y - mean), 2.0) + Math.pow((z - mean), 2.0)) / 4.0);

    System.out.printf("The mean is worth %.3f\n", mean);
    System.out.printf("The deviation is %.3f\n", deviation);

    keyboard.close();
    }
}