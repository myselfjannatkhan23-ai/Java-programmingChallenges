import java.util.Scanner;

public class GreatestThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check Greatest number");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now,Please enter your second number: ");
        int second = input.nextInt();
        System.out.print("Now, enter your third number: ");
        int third = input.nextInt();

        if(first >= second && first >= third) {
            System.out.println(first + "Greatest number");
        }
        else if (second >= third) {
            System.out.println(second +" is Greatest number");
        }
        else{
            System.out.println(third + "Greatest number");
        }

    }
}
