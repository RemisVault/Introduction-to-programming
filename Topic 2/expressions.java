public class expressions {

   public static void main(String[] args) {
    
   
    int x = 2;
    int y = 5;
    double expression1, expression2;

    expression1 = x + y / 3.0 - 4 * 2.0 * 5 / x - 3.0;
    expression2 = x * y + 2.0 * x / 3.0 * 5.0 + 4.0 / x - 1.0;

    System.out.printf("The first expression is worth %.5f\n", expression1);
    System.out.printf("The second expression is worth %.5f\n", expression2);
    }
}