### ✅ Task 3: `DistanceFromAverageExceptionHandling.java`

**Goal:** Ask for array size, handle invalid or negative sizes, and show distance from average.

```java
import java.util.Scanner;

public class DistanceFromAverageExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        System.out.print("Enter the size of the array (how many numbers): ");
        try {
            size = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("That was not a number. Using default size of 5.");
            size = 5;
            scanner.nextLine(); // clear bad input
        }

        if (size < 0) {
            System.out.println("Negative size not allowed. Using default size of 5.");
            size = 5;
        }

        double[] numbers = new double[size];
        double total = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            try {
                numbers[i] = scanner.nextDouble();
                total += numbers[i];
            } catch (Exception e) {
                System.out.println("That was not a valid number. Using 0.");
                numbers[i] = 0;
                scanner.nextLine(); // clear input
            }
        }

        double average = total / size;
        System.out.println("Average is: " + average);

        for (int i = 0; i < size; i++) {
            double distance = Math.abs(numbers[i] - average);
            System.out.println("Distance of number " + numbers[i] + " from average: " + distance);
        }
    }
}
```