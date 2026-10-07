import java.util.Scanner;
public class valueofx {

        public static void main(String[]args){
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.print("Introduce a number: ");
            int x = keyboard.nextInt();

            keyboard.close();

            if ((x > 0) && (50>= x)) {
                System.out.println(3*x);
            } 
            else if (x > 50){
                System.out.println(x*2);
            }
            else if (x < 0) {
                System.out.println(-x);
            }


        }

}