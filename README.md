# Java Programming Practice Solutions

This repository contains solutions to the Java programming practice questions from Practise 1 Unit 1. Each question is solved with explanations and code examples.

---

## **Table of Contents**

1. [Question 1: Choosing Data Types](#question-1-choosing-data-types)
2. [Question 2: Distance Conversion Program](#question-2-distance-conversion-program)
3. [Question 3: Interactive Distance Conversion Program](#question-3-interactive-distance-conversion-program)
4. [Question 4: Egg Order Calculator](#question-4-egg-order-calculator)
5. [Question 5: Election Vote Percentage Calculator](#question-5-election-vote-percentage-calculator)
6. [Question 6: Percentage Calculator](#question-6-percentage-calculator)
7. [Question 7: Life Insurance Premium Calculator](#question-7-life-insurance-premium-calculator)
8. [Question 8: Photo Frame Price Calculator](#question-8-photo-frame-price-calculator)

---

## **Question 1: Choosing Data Types**

**Task:** Choose the **best data type** for each of the following scenarios, **provide a typical value**, and **explain your choice**.

| Scenario | Data Type | Typical Value | Explanation |
|----------|-----------|---------------|-------------|
| a) The number of people living in a single household | `int` | 4 | The number of people in a household is typically small, so `int` is sufficient. |
| b) The year Nelson Mandela became a president | `int` | 1994 | Years are integers, and `int` can easily accommodate any year. |
| c) The total number of people who attended a Kaizer Chiefs vs. Orlando Pirates match at FNB Stadium | `int` | 94736 | The number of attendees can be large, but `int` can handle it. |
| d) The amount of money left in your bank account | `double` | 1234.56 | Money often requires decimal precision, so `double` is appropriate. |
| e) The population of the earth | `long` | 7800000000 | The population of the earth is a very large number, so `long` is needed. |
| f) The number of passengers on a bus | `int` | 50 | The number of passengers is relatively small, so `int` is sufficient. |
| g) The price of a luxury Mercedes Benz SUV | `double` | 150000.00 | Prices often require decimal precision, so `double` is appropriate. |

---

## **Question 2: Distance Conversion Program**

**Task:** Write a Java program that declares named constants to represent the number of centimeters, inches, meters, and kilometers in a mile. Compute and display the value in centimeters, inches, meters, and kilometers.

```java
public class DistanceConverter {
    public static void main(String[] args) {
        final double CM_PER_MILE = 160934.4;
        final double INCHES_PER_MILE = 63360;
        final double METERS_PER_MILE = 1609.344;
        final double KM_PER_MILE = 1.609344;

        double miles = 10; // Example value

        System.out.println(miles + " miles is:");
        System.out.println((miles * CM_PER_MILE) + " centimeters");
        System.out.println((miles * INCHES_PER_MILE) + " inches");
        System.out.println((miles * METERS_PER_MILE) + " meters");
        System.out.println((miles * KM_PER_MILE) + " kilometers");
    }
}
```

### Explanation:

- We declare constants for the conversion factors.

- We compute the equivalent distances in centimeters, inches, meters, and kilometers.

- We display the results with explanatory text.


## **Question 3: Interactive Distance Conversion Program**

*Task:* Convert the program in Question 2 to an interactive application where the user inputs the number of miles.

```java
import java.util.Scanner;

public class InteractiveDistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        double miles = scanner.nextDouble();

        final double CM_PER_MILE = 160934.4;
        final double INCHES_PER_MILE = 63360;
        final double METERS_PER_MILE = 1609.344;
        final double KM_PER_MILE = 1.609344;

        System.out.println(miles + " miles is:");
        System.out.println((miles * CM_PER_MILE) + " centimeters");
        System.out.println((miles * INCHES_PER_MILE) + " inches");
        System.out.println((miles * METERS_PER_MILE) + " meters");
        System.out.println((miles * KM_PER_MILE) + " kilometers");
    }
}
```

### Explanation:

- We use Scanner to accept user input for the number of miles.

- The rest of the program remains the same as in Question 2.


## **Question 4: Egg Order Calculator**
**Task**: __Write__ a program that __calculates__ the __cost of an egg order__ based __on the number of eggs__.

```java

import java.util.Scanner;

public class EggOrderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs: ");
        int eggs = scanner.nextInt();

        int dozens = eggs / 12;
        int looseEggs = eggs % 12;

        double totalCost = (dozens * 59.99) + (looseEggs * 8.50);

        System.out.println("You ordered " + eggs + " eggs. That's " + dozens + " dozen at R59.99 per dozen and " + looseEggs + " loose eggs at R8.50 each for a total of R" + totalCost);
    }
}
```

### Explanation:

- We calculate the number of dozens and loose eggs.

- We compute the total cost based on the given prices.

- We display the result with a full explanation.


## **Question 5: Election Vote Percentage Calculator**
**Task**: Write a program that calculates the percentage of votes each political structure received.

```java

import java.util.Scanner;

public class ElectionVoteCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter votes for EFFSC: ");
        int effscVotes = scanner.nextInt();
        System.out.print("Enter votes for SASCO: ");
        int sascoVotes = scanner.nextInt();
        System.out.print("Enter votes for ANCYL: ");
        int ancylVotes = scanner.nextInt();

        int totalVotes = effscVotes + sascoVotes + ancylVotes;

        double effscPercentage = (effscVotes * 100.0) / totalVotes;
        double sascoPercentage = (sascoVotes * 100.0) / totalVotes;
        double ancylPercentage = (ancylVotes * 100.0) / totalVotes;

        System.out.println("EFFSC received " + effscPercentage + "% of the vote.");
        System.out.println("SASCO received " + sascoPercentage + "% of the vote.");
        System.out.println("ANCYL received " + ancylPercentage + "% of the vote.");
    }
}

```
### Explanation:

- We accept the number of votes for each political structure.

- We calculate the total votes and the percentage of votes each structure received.

- We display the results.


## **Question 6: Percentage Calculator**
**Task**: Create an application that calculates the percentage of one number relative to another.

```java

import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double a, double b) {
        double percentage = (a / b) * 100;
        System.out.println(a + " is " + percentage + "% of " + b);
    }
}

```
### Explanation:

- We accept two numbers from the user.

- We pass these numbers to the computePercent method, which calculates and displays the percentage.

- We call the method twice, swapping the order of the numbers.


## **Question 7: Life Insurance Premium Calculator**
**Task:** Write a program that calculates the annual policy premium based on the customer's age.

```java

import java.util.Scanner;

public class LifeInsurancePremium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int age = currentYear - birthYear;
        int premium = calculatePremium(age);

        System.out.println("Your annual premium is: R" + premium);
    }

    public static int calculatePremium(int age) {
        int decade = age / 10;
        return (decade + 15) * 20;
    }
}

```
## Explanation:

- We calculate the customer's age based on the current year and birth year.

- We pass the age to the calculatePremium method, which computes the premium.

- We display the premium.


## **Question 8: Photo Frame Price Calculator**
**Task:** Create a class with overloaded methods to compute the price of photo frames.

```java

import java.util.Scanner;

public class PhotoFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of photo frames: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the reward amount: ");
        double reward = scanner.nextDouble();

        System.out.println("Total due (no parameters): " + computePrice());
        System.out.println("Total due (quantity): " + computePrice(quantity));
        System.out.println("Total due (quantity and reward): " + computePrice(quantity, reward));
    }

    public static double computePrice() {
        return 250 * 1.15; // 15% VAT
    }

    public static double computePrice(int quantity) {
        return (250 * quantity) * 1.15; // 15% VAT
    }

    public static double computePrice(int quantity, double reward) {
        return ((250 * quantity) - reward) * 1.15; // 15% VAT
    }
}

```
### Explanation:

- We have three overloaded computePrice methods:

- One with no parameters (default price for one frame).

- One with a quantity parameter.

- One with both quantity and reward parameters.

- We prompt the user for input and test all three methods.

