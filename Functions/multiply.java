package Functions;
import java.util.*;

class multiply {
    
    //creating function to multiply two numbers
    public static int mul_num(int x, int y){
        int product = x*y;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int x = sc.nextInt();
        System.out.print("Enter second number:- ");
        int y = sc.nextInt();
        sc.close();

        int product = mul_num(x,y);
        System.out.print("The product of two numbers is:- "+product);
    }
}
