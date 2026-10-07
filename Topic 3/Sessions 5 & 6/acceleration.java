import java.util.Scanner;
public class acceleration{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final double vf = (100.0* 1000) / 3600.0;
        final int vi = 0; 
        
        System.out.print("Give me the time in seconds: ");
        
        double seconds = keyboard.nextDouble();
        double accel = (vf -vi) / seconds;
        
        System.out.printf("The acceleration is %.2f\n", accel);
    }
}
