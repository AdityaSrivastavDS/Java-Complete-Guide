package Array.Practice;
import java.util.*;

class search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //taking size of array as input
        System.out.print("Enter size of array:- ");
        int size = sc.nextInt();

        //declaring array
        int arr[] = new int[size];

        //taking elements of array as input
        for(int i=0; i<size; i++){
            System.out.print("Enter element for the array as per size given by you:- ");
            arr[i] = sc.nextInt();
        }

        //taking element from user which we have to search
        System.out.print("Enter element which you want to search:- ");
        int num = sc.nextInt();

        //searching for the element given by user
        for(int j=0; j<arr.length; j++){
            if(arr[j] == num){
                System.out.println("Element found at index "+j);
                break;
            }
        }

        sc.close();
    }
}
