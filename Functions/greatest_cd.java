package Functions;
import java.util.Scanner;

class greatest_cd {
    // Function to calculate GCD using Euclidean Algorithm
    public static int common_div(int a, int b){
        int temp;
        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();
        sc.close();

        //calling function
        int result = common_div(a,b);
        System.out.print("Greatest common divisor of "+a+" and "+b+" is:- "+result+"\n");
    }
}
