import java.util.Scanner;

public static void main (String[] args) {

    Scanner keyboard= new Scanner (System.in);
    char option = ' ';
    char computerPlay = ' ';

    System.out.println("1) R. - Rock");
    System.out.println("2) P. - Paper");
    System.out.println("3) S. - Scissors");
    System.out.println("\nState your play:");

    option = keyboard.next().charAt(0);
    int randomPlay = (int)(Math.random()*3); // Not a multiplication. Number between 0 and 2
    keyboard.close();
    switch (randomPlay) {

        case 0: computerPlay = 'R'; break;
        case 1: computerPlay = 'P'; break;
        case 2: computerPlay = 'S'; break;
    }

    System.out.printf("Computer play: %c\n", computerPlay);

    switch(option) {

        case 'r':
        case 'R': if (computerPlay == 'P') 
            System.out.print("You lose");
            else
                if (computerPlay == 'S') 
                    System.out.print("You win!");
                    else 
                        System.out.print("It's a draw"); 
            break;

        case 's':
        case 'S': if (computerPlay == 'R') 
            System.out.print("You lose");
            else
                if (computerPlay == 'P') 
                    System.out.print("You win!");
                    else 
                        System.out.print("It's a draw"); 
            break;
        
        case 'p':
        case 'P': if (computerPlay == 'S') 
            System.out.print("You lose");
            else
                if (computerPlay == 'R') 
                    System.out.print("You win!");
                    else 
                        System.out.print("It's a draw"); 
            break;
    }
}