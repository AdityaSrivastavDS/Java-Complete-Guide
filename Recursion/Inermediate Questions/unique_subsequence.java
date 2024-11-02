//Print all the unique subsequence of a string

import java.util.HashSet;

public class unique_subsequence {
    public static void subsequences(String str, int idx, String new_str, HashSet<String> set){
        //base case
        if(idx == str.length()){

            //if the hashset contains the new string then return
            if(set.contains(new_str)){
                return;
            }else{
                System.out.println(new_str);
                    set.add(new_str);
                    return;
            }
        }

        //holds current character
        char currChar = str.charAt(idx);
        
        /*we have two choices
         * 1. to include the current character in the new string
         * 2. to not include the current character in the new string
         */

        //first choice
        subsequences(str,idx+1,new_str+currChar,set);

        //second choice
        subsequences(str,idx+1,new_str,set);
    }
    public static void main(String[] args) {
        String str = "aaa";

        /*to store the unique subsequences:
         * 1. create a hashset
         * 2. pass it to the function
         * 3. if the hashset contains the new string then return
         * 4. else print the new string and add it to the hashset
         * 5. return
         */
        HashSet<String> set = new HashSet<>();
        subsequences(str,0,"",set);
    }
}

// Time Complexity: O(2^n) where n is the length of the string
//O(2^n) because for every character we have two choices
// Space Complexity: O(n) where n is the length of the string
