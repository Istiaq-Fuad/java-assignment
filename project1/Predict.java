import java.util.Scanner;

public class Predict {
    public static void main(String[] args) {
        Car carDetails = new Car();
        Scanner scan = new Scanner(System.in);

        System.out.print("car cost: ");
        carDetails.setCarCost(scan.nextDouble());

        System.out.print("gas price: ");
        carDetails.setGasPrice(scan.nextDouble());

        System.out.print("fuel efficiency: ");
        carDetails.setFuelEfficiency(scan.nextDouble());

        System.out.print("resale value: ");
        carDetails.setResaleValue(scan.nextDouble());

        scan.close();

        System.out.printf("cost to own: %.2f\n", carDetails.getCostToOwn());
        System.out.printf("cost after resale: %.2f\n", carDetails.costAfterResale());
    }
}
