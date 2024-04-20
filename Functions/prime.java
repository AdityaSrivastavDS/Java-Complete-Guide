package Functions;
import java.util.*;

class prime {
    //creating function
    public static int prime_check(int a){
        int count = 0;
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                count += 1;
            }
        }
        if(count ==2 ){
            System.out.print("The number is prime");
        }
        else{
            System.out.print("The number is not prime");
        }
        return count;
    }
    public static void main(String args[]){
        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number:- ");
        int a = sc.nextInt();
        sc.close();

        //calling function
        prime_check(a);
    }

}
