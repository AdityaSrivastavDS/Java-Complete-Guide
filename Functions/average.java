package Functions;
import java.util.*;

class average {
    //creating function to calculate average
    public static int avg(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();
        System.out.print("Enter third number:- ");
        int c = sc.nextInt();
        sc.close();

        //calling function
        System.out.print("The average of "+a+","+b+" and "+c+" is "+avg(a,b,c));
    }
}
