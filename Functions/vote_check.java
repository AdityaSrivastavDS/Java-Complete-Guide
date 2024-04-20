package Functions;
import java.util.*;

public class vote_check {
    public static int eligibility(int age){
        if(age >=18){
            System.out.print("You are eligible to vote");
        }else{
            System.out.print("You are not eligible to vote");
        }
        return age;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of candidate:- ");
        int age = sc.nextInt();
        sc.close();

        //calling function
        eligibility(age);
    }
}
