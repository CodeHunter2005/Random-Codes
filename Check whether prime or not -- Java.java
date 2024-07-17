import java.util.Scanner;
class Pappu {
    public static void main (String [] arg)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("To find whether a numbrer is prime or not");
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        int i=2;
        while (i <num) {
            if (num%i==0){ 
                System.out.println("The number is not a prime number");  
            }      
            else{
                System.out.println("The number is a prime number");
            }
            i++;
            
        break;
       }
    }
}