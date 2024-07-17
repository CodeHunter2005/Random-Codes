// Program to find roots of QE
import java.util.Scanner;
class Pappu {
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter values of a,b,c for QE ax^2 + bx + c");
        System.out.println("Enter value of a: ");
        double a = scn.nextDouble();
        System.out.println("Enter value of b: ");
        double b = scn.nextDouble();
        System.out.println("Enter value of c: ");
        double c = scn.nextDouble();
        double x1 =  (-b+ Math.sqrt(Math.pow(b,2)- 4*a*c))/2*a;
        double x2 = (-b- Math.sqrt(Math.pow(b,2)- 4*a*c))/2*a;
        System.out.print("The roots of the quadratic equation is" + x1 + "and" + x2);
        
    }
}