import java.util.Scanner; 

public class multiplicationTable 
{

    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in); 

    int i = 1;
    int n;
    int result;

    System.out.print("Introduce a number between 1 and 10 to display its multiplication table: ");    
    n = keyboard.nextInt();
    keyboard.close();
    if (n >= 1 && n <= 10) 
    {
        while (i <= 10) 
        {

            result = i * n;
            System.out.printf("%d x %d = %d\n", n, i, result);
            i++;

        }
    } else 
        {
            System.out.println("Invalid value");
        }

    }
}