import java.util.Scanner;

class CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account number: ");
        int acc = sc.nextInt();

        System.out.print("Beginning balance: ");
        double balance = sc.nextDouble();

        System.out.print("Total charges: ");
        double charges = sc.nextDouble();

        System.out.print("Total credits: ");
        double credits = sc.nextDouble();

        System.out.print("Credit limit: ");
        double limit = sc.nextDouble();

        double newBalance = balance + charges - credits;

        if (newBalance > limit) {
            System.out.println("Credit limit exceed for your account "+acc);
        } else {
            System.out.println("Balance: " + newBalance);
        }
         sc.close();
    }
   
}