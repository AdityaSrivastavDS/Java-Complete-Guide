/*Take an array of Strings input from the user & find the cumulative (combined) length of all those 
strings*/
import java.util.*;

class   ques1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many string you wanted:- ");
        int n = sc.nextInt();

        //Declaring array of string type
        String arr[] = new String[n];

        //taking input strings from user
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        //calculating cumulative length of all strings
        int cum_sum = 0;
        for(int j=0; j<n; j++){
           cum_sum += arr[j].length();
        }
        System.out.println("Cumulative length of all strings is:- "+cum_sum);

        sc.close();
    }
}
