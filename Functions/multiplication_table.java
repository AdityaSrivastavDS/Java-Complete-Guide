package Functions;
import java.util.*;

class multiplication_table {
    //creating function to print multiplication table of a number
    public static int table(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get its table:- ");
        int num = sc.nextInt();
        sc.close();  //use to close scanner, should always be used when taken all inputs

        //calling function
        table(num);
    } 
}

