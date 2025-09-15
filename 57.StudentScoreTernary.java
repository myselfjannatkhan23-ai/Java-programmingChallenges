import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check student score by ternary\n");
        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "low");
        System.out.println("Your category is: " + category);
    }
}
