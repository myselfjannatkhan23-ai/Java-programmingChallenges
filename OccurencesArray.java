import java.util.Scanner;

public class OccurencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now Enter the number you want to find: ");
        int num = input.nextInt();
        int occurences = noOfOccurences(numArr, num);
        System.out.println("Your element was found "+occurences + " times in the array ");
    }

    public static int noOfOccurences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i< numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
