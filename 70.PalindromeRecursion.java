import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker");
        System.out.print("Enter the string to be checked:  ");
        String str = input.next();
        System.out.println("your string is "
                +((isPalindrome(str)? "Palindrome"
                                      : "Not Palindrome")));
    }

    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) {
            return true;
        }
        int lastPas = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPas)) {
            return false;
        }
        String newStr = str.substring(1,lastPas);
        return isPalindrome(newStr);
    }
}
