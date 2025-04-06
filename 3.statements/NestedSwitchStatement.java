//program_selection of fruits.
import java.util.Scanner;

public class NestedSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category number (1-3): ");
        int category = scanner.nextInt();

        // Outer switch to select fruit category
        switch (category) {
            case 1:  // Citrus fruits
                System.out.println("Citrus fruits:");
                switch (category) {
                    case 1:
                        System.out.println("  - Orange");
                        System.out.println("  - Lemon");
                        break;
                }
                break;
            case 2:  // Berries
                System.out.println("Berries:");
                switch (category) {
                    case 2:
                        System.out.println("  - Strawberry");
                        System.out.println("  - Blueberry");
                        break;
                }
                break;
            case 3:  // Stone fruits
                System.out.println("Stone fruits:");
                switch (category) {
                    case 3:
                        System.out.println("  - Peach");
                        System.out.println("  - Cherry");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
                break;
        }

        scanner.close();
    }
}
