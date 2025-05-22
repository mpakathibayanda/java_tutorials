### ✅ Task 4:

#### a) `UsedCarException.java`

```java
public class UsedCarException extends Exception {
    public UsedCarException(String vin) {
        super("Invalid Used Car with VIN: " + vin);
    }
}
```

#### b) `UsedCar.java`

```java
public class UsedCar {
    String vin, make;
    int year, mileage;
    double price;

    public UsedCar(String vin, String make, int year, int mileage, double price) throws UsedCarException {
        if (vin.length() != 4) {
            throw new UsedCarException(vin);
        }

        if (!(make.equals("Ford") || make.equals("Honda") || make.equals("Toyota") ||
              make.equals("Chrysler") || make.equals("Other"))) {
            throw new UsedCarException(vin);
        }

        if (year < 1997 || year > 2024 || mileage < 0 || price < 0) {
            throw new UsedCarException(vin);
        }

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public void display() {
        System.out.println(vin + " | " + make + " | " + year + " | " + mileage + " km | $" + price);
    }
}
```

#### c) `ThrowUsedCarException.java`

```java
import java.util.Scanner;

public class ThrowUsedCarException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsedCar[] cars = new UsedCar[7];
        int count = 0;

        while (count < cars.length) {
            try {
                System.out.print("Enter VIN (4 letters): ");
                String vin = scanner.nextLine();

                System.out.print("Enter Make (Ford, Honda, Toyota, Chrysler, Other): ");
                String make = scanner.nextLine();

                System.out.print("Enter Year (1997-2024): ");
                int year = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Mileage: ");
                int mileage = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Price: ");
                double price = Double.parseDouble(scanner.nextLine());

                cars[count] = new UsedCar(vin, make, year, mileage, price);
                count++;
            } catch (UsedCarException e) {
                System.out.println("UsedCar Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Data entry error. Please try again.");
            }
        }

        System.out.println("\nValid Used Cars:");
        for (UsedCar car : cars) {
            if (car != null) {
                car.display();
            }
        }
    }
}
```