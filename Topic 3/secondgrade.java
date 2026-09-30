import java.util.Scanner;
public class secondgrade {

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        double a, b, c, result1, result2; 

        System.out.print("Give me the coefficient A: ");
        a = keyboard.nextDouble();
        System.out.print("Give me the coefficient B: ");
        b = keyboard.nextDouble();
        System.out.print("Give me the coefficient C: ");
        c = keyboard.nextDouble();

        keyboard.close();

        double determinant = (b * b) - (4 * a * c);
        
        if (determinant < 0) {
            System.out.println("The ecuation has complex solutions");

        } 
        
        else if (determinant == 0) {

            result1 = result2 = -b / (2 * a);
            System.out.printf("The ecuation has two equal roots with a value of %.2f\n", result1);
        }
        
        else if (determinant > 0) {

            result1 = (-b + Math.sqrt(determinant)) / (2*a);
            result2 = (-b - Math.sqrt(determinant)) / (2*a);
            System.out.printf("The ecuation has two real results: %.2f and %.2f", result1, result2);
        }

    }

}
