package String;
import java.util.*;

class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();    // nextLine() for complete line and next() for single word
        System.out.println("Hello " + name);

        sc.close();
    }
}

