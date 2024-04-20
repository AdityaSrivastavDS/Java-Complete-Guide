package Practice;
import java.util.Scanner;

class fibonacci_series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for series:- ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonaaci series upto "+num+" terms:- ");

        for(int i=0; i<=num; i++){
            System.out.print(first+" ");
            int third = first + second;
            first = second;
            second = third;
        }
        sc.close();
    }
}
