import java.util.Scanner;

public class BItwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator");
        System.out.print("Please enter the first Number: ");
        int first = input.nextInt();
        System.out.print("Now,enter the second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is :" + result);
    }
}
