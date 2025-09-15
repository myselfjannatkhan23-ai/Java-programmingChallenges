import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound Interest calculator !");
        System.out.print("Please enter your principle amount Rs :");
        int principle = input.nextInt();
        System.out.print("Now,Please enter the rate of Interest :");
        float rate = input.nextFloat();
        System.out.print("Now, tell me how many years are you borrow : ");
        float years = input.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100) , years);
        System.out.println("compound Interest is Rs:" + compInt);
    }
}
