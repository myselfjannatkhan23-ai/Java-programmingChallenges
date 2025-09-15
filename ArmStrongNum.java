import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check ArmStrong Number");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isArmStrong = isArmStrong(num);
        if(isArmStrong) {
            System.out.println("your number is Armstrong");
        } else {
            System.out.println("your number is not an Armstrong");
        }
    }

    public static boolean isArmStrong(int num) {
        int noOfDigits = noOfDigit(num);
        int numCopy = num ;
        int finalNumber =0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /=10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static  int pow(int num1, int num2) {
        int result = 1;
        int i= 0;
        while(i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num) {
        int digits = 0;
        while(num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}