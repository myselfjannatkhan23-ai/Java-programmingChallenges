import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check Palindrome Number");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("your number is a Palindrome number");
        } else {
            System.out.println("Your number is not a Palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
