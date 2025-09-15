import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Checker! ");
        System.out.print("Please enter your Number: ");
        int num = input.nextInt();

        if(num %2 == 0) {
            System.out.println("Your number is Even ");
        }
        else {
            System.out.println("Your number is Odd");
        }

    }
}
