import java.util.Scanner;

class Q2_LargerNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int x,y;

        System.out.print("Enter first number: ");
        x = sc.nextInt();

        System.out.print("Enter second number: ");
        y = sc.nextInt();

        if (x>y) 
            System.out.println(x+" is larger");
        else if (y>x) 
            System.out.println(y+" is larger"); 
        else 
            System.out.println("The numbers are equal");
    }
}
