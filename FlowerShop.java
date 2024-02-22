import java.util.Scanner;
import java.util.InputMismatchException;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare an array of Flower with a size of 10
        Flower[] flowerInventory = new Flower[10];

        // Greetings
        System.out.println("================================================");
        System.out.println(" WELCOME TO FLOWER MANAGEMENT SYSTEM ");
        System.out.println("================================================");

        // Ask the user to input the number of flowers
        System.out.print("Enter the number of flowers: ");
        int numberOfFlower = input.nextInt();

        // Consume the newline
        input.nextLine();

        // Ask the user to input flower information
        for (int i = 0; i < numberOfFlower; i++) {
            try {
                System.out.print("Enter details for flower" + (i + 1) + " name=");
                String name = input.nextLine();

                System.out.print("Enter details for flower" + (i + 1) + " color=");
                String color = input.nextLine();

                System.out.print("Enter details for flower" + (i + 1) + " price= (RM)");
                double price = input.nextDouble();

                System.out.print("Enter details for flower" + (i + 1) + " quantity=");
                int quantity = input.nextInt();

                // Consume the newline
                input.nextLine();

                // Assign values to the array
                flowerInventory[i] = new Flower(name, color, price, quantity);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric value for price and quantity.");
                input.nextLine(); // Consume the invalid input to avoid an infinite loop
                i--; // Decrement i to re-enter details for the current flower
            }
        }

        // Display all flower details
        System.out.println("\n\n===========Flower Details===========\n");
        for (int i = 0; i < numberOfFlower; i++) {
            System.out.println("\t  " + flowerInventory[i].toString() + "\n");
        }
        System.out.println("=====================================\n");

        // Calculate and display the total values of the flower inventory
        double totalInventoryValue = 0;
        for (Flower flower : flowerInventory) {
            totalInventoryValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("Total Inventory Value: RM" + totalInventoryValue);

        // Allow the user to search for a flower by name and display its details
        System.out.print("Enter the name of the flower to search: ");
        String searchName = input.next();
        for (Flower flower : flowerInventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Flower Found:");
                System.out.println(flower.toString());
                break;
            }
        }

        // Closing message
        System.out.println("================================================");
        System.out.println(" THANK YOU FOR USING FLOWER MANAGEMENT SYSTEM");
        System.out.println("================================================");
    }
}
