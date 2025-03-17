# Java Programming Practice Solutions - Learning Unit 3

This repository contains solutions to the Java programming practice questions from **Learning Unit 3**. Each question is solved with explanations and code examples. The tasks cover key concepts in Java, including **classes, constructors, methods, static methods, and object-oriented programming (OOP)**.

---

## **Topics Covered in This Unit**

### **1. Classes and Objects**
- A **class** is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that the objects will have.
- An **object** is an instance of a class. It represents a real-world entity with its own state and behavior.

### **2. Constructors**
- A **constructor** is a special method used to initialize objects. It has the same name as the class and does not have a return type.
- **Default constructors** are provided by Java if no constructor is defined. They initialize fields to default values (e.g., `0`, `null`, etc.).
- **Overloaded constructors** allow you to create objects with different initial states by accepting different parameters.

### **3. Methods**
- **Methods** define the behavior of a class. They can be **instance methods** (non-static) or **static methods**.
- **Instance methods** operate on the instance variables of an object.
- **Static methods** belong to the class rather than an instance and can be called without creating an object.

### **4. Encapsulation**
- Encapsulation is the concept of bundling data (fields) and methods that operate on the data within a single unit (class).
- **Getter and setter methods** are used to access and modify private fields, ensuring controlled access to the data.

### **5. Object-Oriented Programming (OOP)**
- OOP is a programming paradigm based on the concept of objects, which can contain data and code to manipulate that data.
- Key principles of OOP include **encapsulation**, **inheritance**, **polymorphism**, and **abstraction**.

---

## **Tasks and Solutions**

### **Task 1: Lease Class**

#### **Part a: Lease Class Implementation**

**Task:** Create a class named `Lease` with fields for an apartment tenant’s name, apartment number, monthly rent amount, and term of the lease in months. Include a default constructor, getter and setter methods, and a method to add a pet fee.

```java
public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm;

    // Default constructor
    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000;
        this.leaseTerm = 12;
    }

    // Getter and Setter methods
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    // Method to add pet fee
    public void addPetFee() {
        this.monthlyRent += 250;
        explainPetPolicy();
    }

    // Static method to explain pet policy
    public static void explainPetPolicy() {
        System.out.println("A pet fee of R250 has been added to your monthly rent.");
    }
}

```

__Explanation__:

- The Lease class has fields for tenant name, apartment number, monthly rent, and lease term.

- A default constructor initializes the fields with default values.

- Getter and setter methods allow access to and modification of the fields.

-The addPetFee() method adds R250 to the monthly rent and calls the static explainPetPolicy() method to display a message.


#### **Part b: TestLease Class Implementation***
**Task:** Create a TestLease class to test the Lease class. Declare four Lease objects, prompt the user for values for three of them, and use default values for the fourth.

```java

import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1 = getData();
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease4 = new Lease(); // Default values

        showValues(lease1);
        lease1.addPetFee();
        showValues(lease1);

        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }

    // Method to get user input for Lease fields
    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);
        Lease lease = new Lease();

        System.out.print("Enter tenant name: ");
        lease.setTenantName(scanner.nextLine());

        System.out.print("Enter apartment number: ");
        lease.setApartmentNumber(scanner.nextInt());

        System.out.print("Enter monthly rent: ");
        lease.setMonthlyRent(scanner.nextDouble());

        System.out.print("Enter lease term (in months): ");
        lease.setLeaseTerm(scanner.nextInt());

        return lease;
    }

    // Method to display Lease details
    public static void showValues(Lease lease) {
        System.out.println("\nTenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: R" + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm() + " months");
    }
}

```
__Explanation:__

- The TestLease class declares four Lease objects.

- The getData() method prompts the user for input and returns a Lease object with the provided values.

- The showValues() method displays the details of a Lease object.

-The addPetFee() method is called on lease1, and the results are displayed before and after adding the pet fee.


 ### ***Task 2: BloodData and Patient Classes**
#### **Part a: BloodData Class Implementation**
**Task**: Create a BloodData class with fields for blood type and Rh factor. Include a default constructor and an overloaded constructor.

```java

public class BloodData {
    private String bloodType;
    private String rhFactor;

    // Default constructor
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    // Overloaded constructor
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // Getter and Setter methods
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}

```


__Explanation:__

- The BloodData class has fields for blood type and Rh factor.

- A default constructor initializes the fields to "O" and "+".

- An overloaded constructor allows setting custom values for the fields.

#### **Part b: TestBloodData Application**
**Task:** Create a TestBloodData application to test the BloodData class. Declare two objects, one with user input and one with default values.

```java

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Object with user input
        System.out.print("Enter blood type (O, A, B, AB): ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        BloodData userBloodData = new BloodData(bloodType, rhFactor);

        // Object with default values
        BloodData defaultBloodData = new BloodData();

        // Display details
        System.out.println("\nUser Blood Data: " + userBloodData.getBloodType() + userBloodData.getRhFactor());
        System.out.println("Default Blood Data: " + defaultBloodData.getBloodType() + defaultBloodData.getRhFactor());

        // Change default object to user values
        defaultBloodData.setBloodType(userBloodData.getBloodType());
        defaultBloodData.setRhFactor(userBloodData.getRhFactor());

        // Confirm changes
        System.out.println("\nUpdated Default Blood Data: " + defaultBloodData.getBloodType() + defaultBloodData.getRhFactor());
    }
}

```

__Explanation:__

- The TestBloodData application declares two BloodData objects.

* One object is initialized with user input, and the other uses default values.

* The program displays the details of both objects and updates the default object with the user's values.

#### **Part c: Patient Class Implementation**
**Task:** Create a Patient class with fields for ID number, age, and BloodData. Include a default constructor and an overloaded constructor.

```java

public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    // Overloaded constructor
    public Patient(int idNumber, int age, BloodData bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    // Getter methods
    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }
}

```

__Explanation:__

- The Patient class has fields for ID number, age, and BloodData.

- A default constructor initializes the fields to 0, 0, and default BloodData values.

- An overloaded constructor allows setting custom values for all fields.

#### **Part d: Patient Application**
**Task:** Create an application that declares three Patient objects. Use default values for one, prompt the user for values for the second, and use default BloodData values for the third.

```java

import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Patient 1: Default values
        Patient patient1 = new Patient();
        System.out.println("\nPatient 1 (Default):");
        System.out.println("ID: " + patient1.getIdNumber());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Blood Data: " + patient1.getBloodData().getBloodType() + patient1.getBloodData().getRhFactor());

        // Patient 2: User input
        System.out.print("\nEnter ID for Patient 2: ");
        int id2 = scanner.nextInt();

        System.out.print("Enter age for Patient 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter blood type for Patient 2 (O, A, B, AB): ");
        String bloodType2 = scanner.next();

        System.out.print("Enter Rh factor for Patient 2 (+ or -): ");
        String rhFactor2 = scanner.next();

        BloodData bloodData2 = new BloodData(bloodType2, rhFactor2);
        Patient patient2 = new Patient(id2, age2, bloodData2);

        System.out.println("\nPatient 2 (User Input):");
        System.out.println("ID: " + patient2.getIdNumber());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Blood Data: " + patient2.getBloodData().getBloodType() + patient2.getBloodData().getRhFactor());

        // Patient 3: User input for Patient data, default BloodData
        System.out.print("\nEnter ID for Patient 3: ");
        int id3 = scanner.nextInt();

        System.out.print("Enter age for Patient 3: ");
        int age3 = scanner.nextInt();

        Patient patient3 = new Patient(id3, age3, new BloodData());

        System.out.println("\nPatient 3 (Default BloodData):");
        System.out.println("ID: " + patient3.getIdNumber());
        System.out.println("Age: " + patient3.getAge());
        System.out.println("Blood Data: " + patient3.getBloodData().getBloodType() + patient3.getBloodData().getRhFactor());
    }
}

```

__Explanation:__

- The TestPatient application declares three Patient objects.

- The first object uses default values.

- The second object is initialized with user input.

- The third object uses user input for patient data but default values for BloodData.