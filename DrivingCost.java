import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Total miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Average fees per day: ");
        double fees = sc.nextDouble();

        System.out.print("Tolls per day: ");
        double tolls = sc.nextDouble();

        double costPerDay = (miles / costPerGallon) + fees + tolls;

        System.out.println("Daily driving cost: " + costPerDay);

        sc.close();
    }
}