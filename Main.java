import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int count = 0;
        double total = 0.0;
        double num;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        System.out.println("Enter 5 floating-point numbers:");

        
        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");

            // Check if user entered a valid number
            if (scnr.hasNextDouble()) {
                num = scnr.nextDouble();
                total += num;

                // update max and min
                if (num > max) max = num;
                if (num < min) min = num;

                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.next(); // clear the invalid input
            }
        }

        // compute average and interest
        double average = total / count;
        double interest = total * 0.20;

        // print results
        System.out.println("\nResults:");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Interest on total at 20%%: %.2f%n", interest);

        scnr.close();
    }
}

