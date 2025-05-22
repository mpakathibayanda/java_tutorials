### ✅ Task 2: `SquareRootException.java`

**Goal:** Ask for a whole number, convert it, check for errors, and show its square root if valid.

```java
import java.util.Scanner;

public class SquareRootException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a whole number: ");
        String input = scanner.nextLine();

        try {
            number = Integer.parseInt(input); // Try converting to number
        } catch (Exception e) {
            System.out.println("That was not a valid whole number. Using 0 instead.");
            number = 0;
        }

        try {
            if (number < 0) {
                throw new ArithmeticException("Cannot take square root of a negative number.");
            } else {
                double squareRoot = Math.sqrt(number);
                System.out.println("Square root is: " + squareRoot);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
