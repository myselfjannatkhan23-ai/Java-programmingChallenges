import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication!");
        System.out.print("Please enter first decimal number:");
        double first = input.nextDouble();
        System.out.print("Now,Please enter Second number:");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result is :" + mul);

    }
}
