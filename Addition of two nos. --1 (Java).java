//Java Program 1
import java.util.Scanner;
class Pappu {
    public static void main(String[] args)
    {
        System.out.println("Hi, Welcome to Java Program to add two nos.");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scn.nextInt();
        System.out.println("Enter another number");
        int b = scn.nextInt();     
        System.out.println("The sum of two nos is " + (a+b));
    }
}
