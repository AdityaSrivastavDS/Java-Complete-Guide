//Place three childrens in a single line
//Suppose A, B, C are three childrens. We have to find total no. of arrangements in which they can be placed in a single line.

class SingleLine_arrangement {
    public static void printPermutation(String str, String perm, int idx){
        //base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        //loop to iterate over each character in the string
        for(int i=0; i<str.length(); i++){

            //current character
            char currChar = str.charAt(i);

            //new string after removing the current character
            String newStr = str.substring(0, i) + str.substring(i+1);

            //recursive call
            //perm + currChar is the new permutation
            printPermutation(newStr, perm + currChar, idx+1);
        }
    }
    public static void main(String args[]){
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}


//Time complexity: O(n*n!) where n is the length of the string and n! is the number of permutations
//Space complexity: O(n) where n is the length of the string
