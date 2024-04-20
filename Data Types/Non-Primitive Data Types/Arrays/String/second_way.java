package String;

public class second_way {
    public static void main(String args[]){
        
        //declaration of string using String keyword
        String str;
        String st;

        //defining string
        str = "Hello";
        st = "World";

        //printing string
        System.out.println(str);

        //finding length of string
        System.out.println("The length of string is: " +(str.length()));

        //concatenating string
        //concat() method is used to concatenate two strings
        System.out.println(str.concat(st));
    }
}
