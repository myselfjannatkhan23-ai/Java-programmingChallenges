import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if(num > 0) {
            System.out.println("Your number is Positive");
        }
        else if(num == 0) {
            System.out.println("Your number is Zero");
        }
        else {
            System.out.println("Your number is negative");
        }
    }
}
