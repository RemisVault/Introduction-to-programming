public class expressions2 {

   public static void main(String[] args) {
    
    int x = 2;
    int y = 5;
    int expression1, expression2;

    expression1 = ((x + y) / 3) - 4 * (2 * 5 / (x - 3));
    expression2 = x * ((y + 2 * x) / 3) * 5 + (4 / (x - 1));

    System.out.println(expression1);
    System.out.print(expression2);
    }
}
