/*Input a string from the user. Create a new string called ‘result’ in which you will replace the 
letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 */

import java.util.*;

class ques2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:- ");
        String str = sc.next();

        String result = str;
        for(int i=0; i<str.length(); i++){

            // replace() method replaces all the occurences of the given character
            //it takes two parameters: 1. old character 2. new character
            if(str.charAt(i) == 'e'){
                result = result.replace('e','i');  
            }
        }
        System.out.println("Original string:- "+str);
        System.out.print("String after modification:- "+result);

        sc.close();
    }
}
