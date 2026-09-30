import java.util.Scanner;

public class taxes {
    
    public static double calculateInterest(double investedAmount, double annualInterest, int term, boolean tax_witholding) 
    {
        double interest = investedAmount * (annualInterest / 100) * (term / 12.0);
        if (tax_witholding)
            interest = interest * 0.81;
        return interest;
    }

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
   
    System.out.print("Give me the invested amount: ");
    double investedAmount = keyboard.nextDouble();
   
    System.out.print("Give me the interest rate: ");
    double annualInterest = keyboard.nextDouble();
   
    System.out.print("Give me term: ");
    int term = keyboard.nextInt();

    keyboard.close();

    System.out.printf("The interest is %.2f\n" , calculateInterest(investedAmount, annualInterest, term, false));
    System.out.printf("The interest after taxes is %.2f\n" , calculateInterest(investedAmount, annualInterest, term, true));

    }
}