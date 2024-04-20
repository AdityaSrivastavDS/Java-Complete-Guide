/*Input an email from the user. You have to create a username from the email by deleting the part that
comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 */

 import java.util.*;

class ques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address:- ");
        String email = sc.nextLine();

        String final_email = "";
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                final_email = email.substring(0,i);
                break;
            }
        }
        System.out.print("Email after shortning:- "+final_email);

        sc.close();
    }
}
