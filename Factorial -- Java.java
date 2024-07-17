import java.util.Scanner;
class Pappu{
static int factorial(int num){
if (num==0)
return 1;
else 
return num*factorial(num-1);
}
public static void main (String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        int fact = factorial(num);
        System.out.println("The factorial of " +num+ " is " +fact);
        
    }
}