import java.util.Scanner;

class Q5_DigitSeparate 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.print("Enter a five digit number: ");
        n=sc.nextInt();

        System.out.println(
            (n/10000) + "   " +
            (n/1000%10) + "   " +
            (n/100%10) + "   " +
            (n/10%10) + "   " +
            (n%10)
        );
    }
}
