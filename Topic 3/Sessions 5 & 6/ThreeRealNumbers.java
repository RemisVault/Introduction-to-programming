import java.util.Scanner;
public class ThreeRealNumbers{
public static void main(String[]args) {

    Scanner keyboard = new Scanner(System.in);
    float number1, number2, number3;

    System.out.print("Give me the value of the first number: ");
    number1 = keyboard.nextFloat();

    System.out.print("Give me the value of the second number: ");
    number2 = keyboard.nextFloat();

    System.out.print("Give me the value of the third number: ");
    number3 = keyboard.nextFloat();

    keyboard.close();

    if ((number1 >= number2) && (number2 >= number3)) {
        System.out.println(number3 + ", " + number2 + ", " + number1);
    } else if ((number3 >= number2) && (number2 >= number1)) {
        System.out.println(number1 + ", " + number2 + ", " + number3);
    } else if ((number2 >= number3) && (number3 >= number1)) {
        System.out.println(number1 + ", " + number3 + ", " + number2);
    } else if ((number1 >= number3) && (number3 >= number2)) {
        System.out.println(number2 + ", " + number3 + ", " + number1);
    } else if ((number3 >= number1) && (number1 >= number2)) {
        System.out.println(number3 + ", " + number1 + ", " + number2);
    } else {
        System.out.println(number2 + ", " + number1 + ", " + number3);
    }
 }
}