//Print all the subsequence of a string
//subsequence means that you create a new sequence using the characters of the string

public class subsequence {
    public static void subsequences(String str, int idx, String new_str){
        //base case
        if(idx == str.length()){
            System.out.println(new_str);
            return;
        }

        //holds current character
        char currChar = str.charAt(idx);
        
        /*we have two choices
         * 1. to include the current character in the new string
         * 2. to not include the current character in the new string
         */

        //first choice
        subsequences(str,idx+1,new_str+currChar);

        //second choice
        subsequences(str,idx+1,new_str);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
    }
}

// Time Complexity: O(2^n) where n is the length of the string
//O(2^n) because for every character we have two choices
// Space Complexity: O(n) where n is the length of the string
