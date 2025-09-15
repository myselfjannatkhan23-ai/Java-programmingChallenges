import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Left Shift Operator\n");
        System.out.print("Please enter your number: ");
        int number= input.nextInt();

        int result = number << 1;
        System.out.println("Your result is: " + result);
    }
}

