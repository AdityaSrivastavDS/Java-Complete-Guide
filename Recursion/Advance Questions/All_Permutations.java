//Print all permutations of a string keeping the sequence but changing cases.

class All_permutations {

    /*str will be main string while
     * permutation will be the string which will be printed
     */
    public static void printPermutations(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        //we will use for loop to iterate through the string for all the characters
        for(int i=0; i<str.length(); i++){

            //holds the current character present at index i
            char currChar = str.charAt(i);

            /* "abc" -> "ab" + "c"
            newStr will hold the string after removing the current character
            we will use substring method to remove the current character
            substring method will return the string from index 0 to i-1 and from i+1 to end
            we will add both the strings to get the new string*/

            String newStr = str.substring(0,i)+str.substring(i+1);

            //permutation+currChar will add the current character to the permutation string
            //newStr will be the new string which will be passed in the recursive call
            printPermutations(newStr, permutation+currChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printPermutations(str, "");
    }
}



/*Time complexity:-
 * 1.For first choice -> n
 * 2.For second choice -> n-1
 * 3.For third choice -> n-2
 * Therefore total complexity is n*(n-1)*(n-2)....*1 = n! or  O(n!)
 */