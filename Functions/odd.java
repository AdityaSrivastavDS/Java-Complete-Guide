package Functions;
import java.util.*;

class odd {
    public static int odd_check(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        sc.close();

        //calling function
        System.out.print("The sum of odd numbers upto "+n+" is "+odd_check(n));
    }
}
