import java.util.Scanner;

public class sigmaOpenInterval {

    public static void main (String []args)

    {
        Scanner keyboard = new Scanner(System.in);
        int n;
        int m;
        int printvalue = 0;

        System.out.print("Introduce the value of n: ");
        n = keyboard.nextInt();
        System.out.print("Introduce the value of m: ");
        m = keyboard.nextInt();
        
        int i = n + 1;
        while (i < m) 
        {
            printvalue = printvalue + i;
            i++;
        }
        System.out.printf("The sum of every value in the open interval (%d, %d) is %d\n", n, m, printvalue);

        keyboard.close();
    }

}