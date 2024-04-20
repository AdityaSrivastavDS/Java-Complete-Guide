package Array;

import java.util.Scanner;

class user_defined{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //taking size of array as input
        System.out.print("Enter size of array:- ");
        int size = sc.nextInt();

        //defining array
        int arr[] = new int[size];

        //taking input
        for(int i=0; i<size; i++){
            System.out.print("Enter elements of array as per size you have given:- ");
            arr[i] = sc.nextInt();
        }

        //printing array
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}