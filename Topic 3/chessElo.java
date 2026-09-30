import java.util.Scanner;

public class chessElo {
    
    public static int calculateElo(int pointsa, int pointsb, int kvalue, float result) {
      
        int newElo = (int) (pointsa + kvalue * (result - Math.pow(10, pointsa/400.0) / 
                                           (Math.pow(10, pointsa/400.0) + Math.pow(10, pointsb/400.0))));
        return newElo;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Give me the points of player a: ");
        int pointsa = keyboard.nextInt();
        
        System.out.print("Give me the points of player b: ");
        int pointsb = keyboard.nextInt();
        
        System.out.print("Give me constant value of k: ");
        int kvalue = keyboard.nextInt();

        System.out.print("Tell me if player a won (type 1), drew (type 0.5) or lost (type 0): ");
        float result = keyboard.nextFloat();

        keyboard.close();

        System.out.printf("The elo for player A is %d", calculateElo(pointsa, pointsb, kvalue, result));
    
   } 
}