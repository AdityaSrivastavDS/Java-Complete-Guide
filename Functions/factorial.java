package Functions;
import java.util.*;

class factorial {
    public static int calculate_fact(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
           fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial:- ");
        int a = sc.nextInt();
        sc.close();

        System.out.print("The factorial of given number is:- "+calculate_fact(a));
    }
}
