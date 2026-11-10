
import java.util.Scanner;
import java.util.Arrays;

public class itemPrices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] prices = new double[12];
        int size = 10;

        // (a) Enter prices of 10 items
        System.out.println("Enter prices of 10 items:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Price " + (i + 1) + ": ");
            prices[i] = input.nextDouble();
        }

        // (b) Insert a price at the beginning
        System.out.print("Enter a new price to insert at the beginning: ");
        double newPrice = input.nextDouble();

        for (int i = size; i > 0; i--) {
            prices[i] = prices[i - 1];
        }

        prices[0] = newPrice;
        size++;

        // Insert a price at a specific index
        System.out.print("Enter the index to insert a price: ");
        int index = input.nextInt();

        if (index >= 0 && index <= size) {

            System.out.print("Enter the new price: ");
            newPrice = input.nextDouble();

            for (int i = size; i > index; i--) {
                prices[i] = prices[i - 1];
            }

            prices[index] = newPrice;
            size++;

        } else {
            System.out.println("Invalid index!");
        }

        // (c) Display prices in input order
        System.out.println("\nPrices in input order:");

        for (int i = 0; i < size; i++) {
            System.out.println(prices[i]);
        }

        // Display prices in reverse order
        System.out.println("\nPrices in reverse order:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(prices[i]);
        }

        // (d) Calculate total sum
        double total = 0;

        for (int i = 0; i < size; i++) {
            total += prices[i];
        }

        System.out.println("\nTotal price = " + total);

        // (e) Binary Search
        // Create a sorted copy of the array
        double[] sortedPrices = Arrays.copyOf(prices, size);
        Arrays.sort(sortedPrices);

        System.out.print("\nEnter a price to search: ");
        double searchPrice = input.nextDouble();

        int low = 0;
        int high = size - 1;
        int foundIndex = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (sortedPrices[mid] == searchPrice) {
                foundIndex = mid;
                break;
            }
            else if (searchPrice > sortedPrices[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Price found at index: " + foundIndex);
        } else {
            System.out.println("Price not found.");
        }

        input.close();
    }
}
