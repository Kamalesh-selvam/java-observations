package lab_observations;
import java.util.Scanner;

public class Car {
    // Attributes
    private String model;
    private String color;
    private boolean isRunning;

    // Constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.isRunning = false;
    }

    // Method to start the car
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The " + color + " " + model + " is now running.");
        } else {
            System.out.println("The " + color + " " + model + " is already running.");
        }
    }

    // Method to stop the car
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The " + color + " " + model + " has been stopped.");
        } else {
            System.out.println("The " + color + " " + model + " is already stopped.");
        }
    }

    // Main method to get user input and demonstrate functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter the car color: ");
        String color = scanner.nextLine();

        // Create a Car instance
        Car userCar = new Car(model, color);

        // Display the created car details
        System.out.println("Created a car with model: " + userCar.model + " and color: " + userCar.color);

        // Demonstrate starting and stopping the car
        userCar.start();
        userCar.stop();

        // Close the scanner
        scanner.close();
    }
}
