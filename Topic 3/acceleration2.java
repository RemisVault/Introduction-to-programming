import java.util.Scanner;
public class acceleration2{

    public static double calculateAcceleration(double seconds){

        final double vf = (100.0* 1000) / 3600.0;
        final int vi = 0; 

        double accel = (vf -vi) / seconds;

        return accel;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Give me the time in seconds: ");
        
        double seconds = keyboard.nextDouble();
    
        System.out.printf("The acceleration is %.2f\n", calculateAcceleration(seconds));
    }
}
