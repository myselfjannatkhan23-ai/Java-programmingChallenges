import java.util.Random;
import java.util.Scanner;

    public class SquidGameRedLightGreenLight {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int playerPosition = 0;
            int finishLine = 10;
            boolean isGameOver = false;

            System.out.println("Welcome to Squid Game: Red Light, Green Light!");
            System.out.println("Rules:");
            System.out.println("- Move forward only when it's GREEN light.");
            System.out.println("- If you try to move on RED light, you're out!\n");

            while (!isGameOver) {
                System.out.println("\nYou're at position: " + playerPosition + " / " + finishLine);
                System.out.println("Press Enter to attempt a move...");
                scanner.nextLine();

                boolean isGreenLight = random.nextBoolean(); // true = Green, false = Red

                if (isGreenLight) {
                    System.out.println("🟢 GREEN LIGHT! You moved forward safely.");
                    playerPosition++;

                    if (playerPosition >= finishLine) {
                        System.out.println("\n🎉 Congratulations! You crossed the finish line and survived!");
                        isGameOver = true;
                    }
                } else {
                    System.out.println("🔴 RED LIGHT! You moved... and got caught!");
                    System.out.println("💀 Game Over!");
                    isGameOver = true;
                }

                // Pause for dramatic effect
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Ignore error
                }
            }

            scanner.close();
        }
    }

