//this module contains the scanner input stream
import java.util.Scanner;

class scanner {
    public static void main(String args[]){

        //declaration of variables
        int uc;
        int i;
        int fact = 1;

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");

        //here we had used nextInt because we are taking integer input
        uc = sc.nextInt();
        sc.close();

        for(i = 1;i <= uc; i++){
            fact *= i;
        }

        //we will print the factorial of the number outside of for loop
        //otherwise it will print same statement multiple times
        System.out.print("Factorial of " + uc + " is " + fact);

        //close the scanner
        sc.close();
    }
}
