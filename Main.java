import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Map<String, String> tracker = new HashMap<>();

        System.out.println("Hello! This program will help you to keep track of the work\n" +
                "that you did for your aquarium and your fish.");
        while (true) {
            System.out.println("Would you like to:\n" +
                    "1. Write down the note.\n" +
                    "2. Look at your entries for a specified date.\n" +
                    "3. Look at your all entries.\n" +
                    "4. Quit.\n" +
                    "Please enter a number: ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Write your date in mm/dd/yyyy format:");
                String date = scanner2.nextLine();
                System.out.println("Enter the work that has been done:");
                String description = scanner2.nextLine();
                tracker.put(date, description);

                scanner2 = new Scanner(System.in);

            } else if (input == 2) {
                System.out.println("Write the date that you are looking for in mm/dd/yyyy format:");
                String searchDate = scanner2.nextLine();
                System.out.println("Your entry is: " + tracker.get(searchDate));

            } else if (input == 3) {
                for (Map.Entry<String, String> entry : tracker.entrySet()) {
                    String date = entry.getKey();
                    String description = entry.getValue();
                    System.out.println("Date: " + date + "\n Description: " + description);
                }
            } else if (input == 4) {
                System.out.println("Bye, bye!");
                break;
            } else {
                System.out.println("Try again ");
            }
        }
    }
}