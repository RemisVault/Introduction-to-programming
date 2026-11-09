public class if {

    public static void main (String[]args){
        int n = 3;
/* Depending on the value of n the program will return a different output 
Pregunta de examen. Usar else en construcciones como esta para optimizar 
el codigo*/
        if (n == 0) 
            System.out.println("N is zero");
          
        else
            if (n > 0)    
                System.out.println("N is positive");
            else 
                System.out.println("N is negative");

        System.out.println("Program finished");

    }
}