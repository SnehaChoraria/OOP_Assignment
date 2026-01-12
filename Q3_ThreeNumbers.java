import java.util.Scanner;

class Q3_ThreeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter three integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int sum=a+b+c;
        int product=a*b*c;
        int largest =a;
        int smallest =a;

        if (b>largest)
            largest=b;
        if (c>largest)
            largest=c;

        if (b<smallest)
            smallest=b;
        if (c<smallest)
            smallest=c;

        double average=sum/3.0;

        System.out.println("Sum = " +sum);
        System.out.println("Average = " +average);
        System.out.println("Product = " +product);
        System.out.println("Largest = " +largest);
        System.out.println("Smallest = "+smallest);
    }
}
