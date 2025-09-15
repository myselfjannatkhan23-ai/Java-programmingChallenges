import java.util.Scanner;

public class LoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print pattern\n");
        System.out.print("please enter the number of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseHalfPyramid(rows);
        printLeftHalfPyramid(rows);
    }


    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("Here is the left half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows ) {
                System.out.print(" ");
                j++;
            }
            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

        public static void printReverseHalfPyramid ( int maxRows){
            System.out.println("\nHere is the Reverse Right half Pyramid");
            int rows = maxRows;
            while (rows > 0) {
                int i = 0;
                while (i < rows) {
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows--;
            }
        }

        public static void printRightHalfPyramid ( int maxRows){
            System.out.println("\nHere is Right Half Pyramid");
            int rows = 0;
            while (rows < maxRows) {
                System.out.print("*");
                int i = 0;
                while (i < rows) {
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows++;
            }
        }

    }

