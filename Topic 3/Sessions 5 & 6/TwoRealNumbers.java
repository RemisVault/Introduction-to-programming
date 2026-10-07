import java.util.Scanner;
public class TwoRealNumbers{
public static void main(String[]args) {

    Scanner keyboard = new Scanner(System.in);
    double number1, number2;

    System.out.print("Give me the value of the first number: ");
    number1 = keyboard.nextDouble();

    System.out.print("Give me the value of the second number: ");
    number2 = keyboard.nextDouble();

    keyboard.close();

    if (number1 > number2) {
        System.out.printf("%.2f\n %.2f", number1, number2);
    } else if (number1 < number2) {
        System.out.printf("%.2f\n %.2f", number2, number1);
    } else {
        System.out.printf("Both numbers have the same value: %.2f", number1);
    }
 }
}