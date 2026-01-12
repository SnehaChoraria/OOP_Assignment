import java.util.Scanner;

class Q4_Circle 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);

        int r;
        double dia, circum, area;

        System.out.print("Enter radius: ");
        r=sc.nextInt();

        dia=2*r;
        circum=2*3.14159*r;
        area=3.14159*r*r;

        System.out.println("Diameter = "+dia);
        System.out.println("Circumference = "+circum);
        System.out.println("Area = "+area);
    }
}
