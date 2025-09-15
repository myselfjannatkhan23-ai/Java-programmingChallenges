import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to find the greatest number by using ternary operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number");
        int num2 = input.nextInt();

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater number");
    }

}