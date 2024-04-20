package Functions;
import java.util.*;

class greatest {
    public static int great_num(int a, int b){
        if(a > b){
            System.out.print("a is greater than b");
        }else{
            System.out.print("b is greater than a");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();
        sc.close();

        //calling function
        great_num(a,b);
    }
}
