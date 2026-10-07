import java.util.Scanner;
public class leapYear {

    public static boolean determineLeapYear(int year){ 
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int year;
        System.out.print("Give me a year: ");
        year = keyboard.nextInt();
        keyboard.close();

        if (determineLeapYear(year)) { 
        System.out.printf("The year %d is a leap year", year);
        } else { 
        System.out.printf("The year %d is not a leap year", year);
        }
    
    }
}