## ✅ Task 1a: Create Dog class

```java
public class Dog {
    private String dogName;
    private String dogColor;
    private int dogBirthYear;

    public void setName(String name) {
        dogName = name;
    }

    public void setColor(String color) {
        dogColor = color;
    }

    public void setBirthYear(int year) {
        dogBirthYear = year;
    }

    public String getName() {
        return dogName;
    }

    public String getColor() {
        return dogColor;
    }

    public int getBirthYear() {
        return dogBirthYear;
    }
}
```

---

## ✅ Task 1b: Create RacingDog (child of Dog)

```java
public class RacingDog extends Dog {
    private int numberOfRaces;

    public void setNumberOfRaces(int races) {
        numberOfRaces = races;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }
}
```

---

## ✅ Task 1c: DemoDog.java – Ask user and show both Dog and RacingDog

```java
import java.util.Scanner;

public class DemoDog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create normal Dog
        Dog normalDog = new Dog();
        System.out.print("Enter dog name: ");
        normalDog.setName(input.nextLine());

        System.out.print("Enter dog color: ");
        normalDog.setColor(input.nextLine());

        System.out.print("Enter dog birth year: ");
        normalDog.setBirthYear(input.nextInt());
        input.nextLine(); // clear newline

        System.out.println("\nNormal Dog Info:");
        System.out.println("Name: " + normalDog.getName());
        System.out.println("Color: " + normalDog.getColor());
        System.out.println("Birth Year: " + normalDog.getBirthYear());

        // Create RacingDog
        RacingDog raceDog = new RacingDog();
        System.out.print("\nEnter racing dog name: ");
        raceDog.setName(input.nextLine());

        System.out.print("Enter racing dog color: ");
        raceDog.setColor(input.nextLine());

        System.out.print("Enter racing dog birth year: ");
        raceDog.setBirthYear(input.nextInt());

        System.out.print("Enter number of races: ");
        raceDog.setNumberOfRaces(input.nextInt());

        System.out.println("\nRacing Dog Info:");
        System.out.println("Name: " + raceDog.getName());
        System.out.println("Color: " + raceDog.getColor());
        System.out.println("Birth Year: " + raceDog.getBirthYear());
        System.out.println("Races: " + raceDog.getNumberOfRaces());

        input.close();
    }
}
```
