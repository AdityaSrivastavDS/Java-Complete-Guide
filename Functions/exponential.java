package Functions;
import java.util.*;


class exponential {
    public static int product(int x, int n){
        int prod;
        prod = (int) Math.pow(x,n);
        return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base:- ");
        int x = sc.nextInt();
        System.out.print("Enter power:- ");
        int n = sc.nextInt();
        sc.close();

        //calling function
        int prod = product(x,n);
        System.out.print("Product of "+x+" raised to "+n+" is:- "+prod);
    }
}
