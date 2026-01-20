import java.util.Scanner;

 class GasMileage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double totalMiles=0, totalGallons=0;

        while (true) {
            System.out.print("Enter miles (-1 to exit ): ");
            double miles = sc.nextDouble();
            if (miles == -1) break;

            System.out.print("Enter gallons: ");
            double gallons = sc.nextDouble();

            System.out.println("Mileage: " + (miles / gallons));

            totalMiles += miles;
            totalGallons += gallons;
        }

        if (totalGallons != 0) {
            System.out.println("Average is : " + (double)(totalMiles / totalGallons));
        }
        sc.close();
    }
}