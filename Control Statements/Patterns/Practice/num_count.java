package Practice;
import java.util.Scanner;

class num_count {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;

        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        char choice;

        do{
            System.out.print("Enter a number:- ");
            num = sc.nextInt();

            if(num > 0){
                positive_count++;
            }
            else if(num < 0){
                negative_count++;
            }
            else{
                zero_count++;
            }
            System.out.print("Do you want to enter more numbers? (y/n): ");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positive_count);
        System.out.println("Count of negative numbers: " + negative_count);
        System.out.println("Count of zeros: " + zero_count);

        sc.close();
    }
}
