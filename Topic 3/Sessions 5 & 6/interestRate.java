import java.util.Scanner;


public class interestRate {

    public static double calculateInterest( double investedAmount,double annualInterest, int term) 
    {
        double interest = investedAmount * (annualInterest / 100) * (term / 12.0);
        return interest;
    }

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
   
    System.out.println("Give me the invested amount: ");
    double investedAmount = keyboard.nextDouble();
   
    System.out.println("Give me the interest rate: ");
    double annualInterest = keyboard.nextDouble();
   
    System.out.println("Give me term: ");
    int term = keyboard.nextInt();

    System.out.print("The interest is " + calculateInterest(investedAmount, annualInterest, term));
    }
}
