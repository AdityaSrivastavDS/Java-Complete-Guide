package Functions;
import java.util.*;

class sums {
    
    //creating function to add two number
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){

        //taking input from user 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();
        sc.close();

        //calling function
        int sum = add(a,b);
        System.out.println("The sum of two numbers is:- "+sum);
    }
}
