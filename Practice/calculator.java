import java.util.Scanner;

class calculator_logic{
    int a,b;
    calculator_logic(int x, int y){
          a = x;
          b = y;
    }
    //we had defined all methods without static as switch cannot handle or use static methods
    public int addition(int a ,int b){
        return a+b; 
    }
    public int subtraction(int a ,int b){
        return a - b;
    }
    public int division(int a ,int b){
        return a / b;
    }
    public int mult(int a ,int b){
        return a * b;
    }
}
class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Enter the operator: ");
        char opr = sc.next().charAt(0);

        calculator_logic obj = new calculator_logic(x, y);

        //defining cases for calculator
        switch(opr){
            case '+':
               System.out.print(obj.addition(x,y));
               break;
            case '-':
               System.out.print(obj.subtraction(x,y));
               break;
            case '/':
               System.out.print(obj.division(x, y));
               break;
            case '*':
               System.out.print(obj.mult(x, y));
               break;
        }

        sc.close();
    }
}