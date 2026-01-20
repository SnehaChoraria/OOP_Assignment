import java.util.Scanner;

class ParkingCharges {
    static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours>3) {
            charge =charge +Math.ceil(hours-3)*0.5;
        }//for rounding to upper closest value 

        return Math.min(charge, 10.0);// returns whatever is minimum 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
         System.out.println("Enter number of people");
int n=sc.nextInt();

       for(int i=1;i<=n; i++)
            System.out.print("Enter hours by person”+i+” : ");
            double hours=sc.nextDouble();
            double charge = ParkingCharges.calculateCharges(hours);
            total += charge;
            System.out.println("Charge: " + charge);
        

        System.out.println("Total receipts: " + total);
    }
}