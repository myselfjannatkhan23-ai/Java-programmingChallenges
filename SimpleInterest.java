import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator ");
        System.out.print("Please enter your principle amount Rs :");
        int principle = input.nextInt();
        System.out.print("Now,Please enter the rate of Interest :");
        float rate = input.nextFloat();
        System.out.print("Now, tell me how many years are you born : ");
        float years = input.nextFloat();

        float Interest = (principle * rate * years )/100;
        System.out.println("\n\n your Simple Interest in Rs is : " + Interest);
    }
}
