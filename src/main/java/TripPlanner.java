import java.text.NumberFormat;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter trip distance (miles): ");
        double distance = scan.nextDouble();
        System.out.print("Enter average speed (mph): ");
        double speed = scan.nextDouble();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double efficiency = scan.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double price = scan.nextDouble();

        double travelTime = calculateTravelTime(distance, speed);
        double fuelNeeded = calculateFuelNeeded(distance, efficiency);
        double tripCost = calculateTripCost(price, distance, efficiency);

        System.out.println();
        displayResults(travelTime, fuelNeeded, tripCost);
    }

    public static double calculateTravelTime(double distance, double speed) {
        return distance/speed;
    }

    public static double calculateFuelNeeded(double distance, double efficiency) {
        return distance/efficiency;
    }

    public static double calculateTripCost(double price, double distance, double efficiency) {
        return price*(distance/efficiency);
    }

    public static void displayResults(double travelTime, double fuelNeeded, double tripCost) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Results:");
        System.out.println("Travel Time: " + travelTime);
        System.out.println("Fuel Needed: " + fuelNeeded);
        System.out.println("Trip Cost: " + nf.format(tripCost));
    }
}
