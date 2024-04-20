package String;

import java.lang.StringBuffer;

public class string_buffer {
    public static void main(String args[]){

        //creating buffer string
        StringBuffer strb = new StringBuffer("Hello");

        //using append method to add new substring
        strb.append(" World");

        //printing the string after appending
        System.out.print("String before reverse: "+strb);

        System.out.println();


        //operations that can be performed on string
        //inserting at specific position using insert method
        strb.insert(5, " this ");
        System.out.print("String after insertion: ");
        System.out.print(strb);



        System.out.println();


        //replacing substring using replace method
        strb.replace(5, 9, " is ");
        System.out.print("String after replacement: ");
        System.out.print(strb);


        System.out.println();

        //deleting substring using delete method
        strb.delete(5, 8);
        System.out.print("String after deletion: ");
        System.out.print(strb);

        
        System.out.println();

        //reversing the string using reverse method
        System.out.print("The string after reverse: ");
        System.out.print(strb.reverse());

    }
}
