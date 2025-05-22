### ✅ Task 1: `ParseDouble.java`

**Goal:** Get a number from the user. If it's not a valid number, show an error and set the number to 0.

```java
import java.util.Scanner;

public class ParseDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;

        System.out.print("Please enter a number with decimal (like 3.14): ");
        String input = scanner.nextLine();

        try {
            number = Double.parseDouble(input); // Try changing the text to a number
        } catch (NumberFormatException e) {
            System.out.println("Oops! That was not a valid number. Setting it to 0.");
            number = 0;
        }

        System.out.println("Your number is: " + number);
    }
}
```