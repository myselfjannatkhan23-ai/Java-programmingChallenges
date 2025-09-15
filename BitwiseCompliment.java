import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator\n");
        System.out.print("Please enter your number: ");
        int number= input.nextInt();

        int result = ~number;
        System.out.println("Your reult is: " + result);
    }
}
