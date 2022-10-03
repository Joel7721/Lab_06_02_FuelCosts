import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {

        String trash;
        double gallons = 0;
        double efficiency = 0;
        double pricePerGallon = 0;
        double miles;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of gallons in the tank: ");

        if (in.hasNextDouble()) {
            gallons = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine(); //clear the buffer
            System.out.println("You have entered an invalid value: " + trash);
            System.exit(0);

        }

        System.out.println("Enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble()) {
            efficiency = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine(); //clear the buffer
            System.out.println("You have entered an invalid value: " + trash);
            System.exit(0);

        }
        System.out.println("Enter the price per gallon of gas: ");
        if (in.hasNextDouble()) {
            pricePerGallon = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine(); //clear the buffer
            System.out.println("You have entered an invalid value: " + trash);
            System.exit(0);

        }

        double hundred = 100 / efficiency;
        double milesCost = hundred * pricePerGallon;
        miles = gallons * efficiency;

        System.out.printf("The cost per 100 miles is %.2f", milesCost);
        System.out.println(" ");
        System.out.printf("The amount of miles the car can travel with the amount of gas is %.2f", miles);
        System.exit(0);

    }
}
