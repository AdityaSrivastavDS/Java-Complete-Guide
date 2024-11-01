import java.util.Scanner;

class Factor {
    public static int fact(int num){
        int fac = 1;
        for(int i=1; i<=num; i++){
            fac *= i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        System.out.println(fact(num));

        sc.close();
    }
}
