import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num: -num;
        System.out.print("Absolute value is: " + result);
    }
}
