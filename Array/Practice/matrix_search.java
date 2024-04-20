package Array.Practice;
import java.util.Scanner;

class matrix_search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //taking rows and column as input
        System.out.print("Enter number of rows:- ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns:- ");
        int column = sc.nextInt();

        //declaring matrix
        int matrix[][] = new int[rows][column];

        //taking elements from user
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter element:- ");
                matrix[i][j] = sc.nextInt();
            }
        }    
        
        //element to search
        System.out.print("Enter element to search:- ");
        int num = sc.nextInt();

        //checking if element is present or not
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                if(matrix[i][j] == num){
                    System.out.println("Element found at position:- " + i + " " + j);
                }
            }
        }
        sc.close();
    }
}
