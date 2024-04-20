package Array;
import java.util.Scanner;

class Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    
        //taking number of rows and column as input
        System.out.print("Enter number of rows:- ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns:- ");
        int column = sc.nextInt();

        //declaring matrix 
        int matrix[][] = new int[rows][column];

        //for input
        //for rows
        for(int i=0; i<rows; i++){
            //for column
            for(int j=0; j<column; j++){
                System.out.println("Enter element:- ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("Matrix:- ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
