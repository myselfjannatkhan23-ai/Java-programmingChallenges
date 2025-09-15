import java.util.Scanner;

public class CategorizePerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Categorize Person checker");
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();

        if(age <=13) {
            System.out.println("you are a child");
        } else if (age <= 20) {
            System.out.println("YOu are a teenager");
        }
        else if(age <=60) {
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are a Senior");
        }
    }
}
