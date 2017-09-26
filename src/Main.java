import java.util.*;

public class Main {
    public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);

    System.out.println("Welcome to this Computer!");
    System.out.println("");
    System.out.println("This program is designed to complete simple addition of 2 numbers.");
    System.out.println("");
    System.out.println("Please enter you first number: ");
    int number1 = scnr.nextInt();
    System.out.println("Please enter your second number: ");
    int number2 = scnr.nextInt();

    int result = 0;
    result = (number1 + number2);
    System.out.println("Your result is " + result);
    }
}
