//creating a function
//function is a block of code which is executed when it is called
 //function is used to break the code into small modules
 //function is defined outside the main function
 //function can be called multiple times
//function can be called from any other function
//function can be called from main function
//function can be called from any other function

package Functions;
import java.util.*;

class functions {
    public static void printMyName(String name){
        System.out.println("My name is "+name);
        return;
    }
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your name:- ");
          String name = sc.next();
          sc.close();

          printMyName(name);
    }
 
}
