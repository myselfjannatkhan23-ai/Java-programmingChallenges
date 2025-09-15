import java.util.Scanner;

class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurences");
        int[] nums = ArrayUtility.inputArray();
        System.out.print("Now, Enter the number you want to search: ");
        int elements = input.nextInt();
        int occ = countOccurences(nums, elements);
        System.out.println("Your element was found: " + occ + " times.");

    }

    public static int countOccurences(int[] nums, int element) {
        int occ = 0;
        for(int num : nums) {
            if(num == element) {
                occ++;
            }
        }
        return occ;
    }
}
