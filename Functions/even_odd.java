package Functions;

import java.util.Scanner;

class even_odd {
    //creating function
    public static int even_check(int n){
        if(n%2 == 0){
            System.out.print("The number is even");
        }else{
            System.out.print("The number is not even.....Kindly recheck your input!");
        }
        return n;
    }
    public static void main(String args[]){
        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number:- ");
        int n = sc.nextInt();
        sc.close();

        //calling function
        even_check(n);
    }
}
