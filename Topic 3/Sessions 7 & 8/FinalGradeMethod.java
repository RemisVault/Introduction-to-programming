import java.util.Scanner;

public static char finalGrade(double t, double p){

    char grade = 'F';

    if (p >= 9 && t >= 9) {
        grade = 'A';
    } else 
            if (p >= 7.5 && t >= 7.5 && (p < 9 || t < 9)) {
        grade = 'B';
    } else 
            if (p >= 5 && t >= 5 && (p < 7.5 || t < 7.5)) {
        grade = 'C';
    } else 
            if (p < 5 || t < 5) {
        grade = 'D';
    }

    return grade;
}

public static void main (String []args) {

    Scanner keyboard = new Scanner(System.in);

    double p;
    double t;

    System.out.println("Introduce the result of the theory exam:");
    t = keyboard.nextDouble();

    System.out.println("Introduce the result of the practical exam:");
    p = keyboard.nextDouble();

    keyboard.close();
    
    System.out.println("The student is graded a " + finalGrade(t, p));





}