import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of the week detector\n");
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();
        //oldSwitch(day);
        newSwitch(day);
    }
        public static void newSwitch(int day){
            String dayStr = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid";
            };
            System.out.println(dayStr);
        }

        public static void oldSwitch(int day){
            switch (day) {
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
                case 7:
                    System.out.print("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
                    break;
            }
        }
    }