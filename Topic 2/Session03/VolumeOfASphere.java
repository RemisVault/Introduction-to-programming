import java.util.Scanner;

public class VolumeOfASphere
{

    static public void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Give me the radius: ");
        double radius = keyboard.nextDouble();
        double volume = 4.0/3 * Math.PI * Math.pow(radius, 3); 

        System.out.printf("The volume of the sphere with a radius of %.1f is %.16f\n", radius, volume);
        System.out.println("\tProgram finished");
        
    }

}1