import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Welcome to Multiplication world");
        System.out.print("Please enter your number: ");
        int num = Scanner.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while(i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
        }
    }
}




