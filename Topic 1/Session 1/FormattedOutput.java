public class FormattedOutput {

    public static void main(String[]args){
        int age = 27;
        double mark = 9.5;
        char group = 'A';

        System.out.printf("Age: %d%n", age);
        System.out.printf("Mark: %.1f%n", mark);
        System.out.printf("Group: %c%n", group);
    }


}
// regex %d%n
// regex %.1f%n
// regex %c%n