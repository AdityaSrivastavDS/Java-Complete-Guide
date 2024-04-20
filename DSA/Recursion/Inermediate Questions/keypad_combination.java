/*Print keypad combination:
 * ( 0 -> .;
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz
)
 */

public class keypad_combination {
    public static String  keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String str, int idx, String combination){
        //base case
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar  = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i=0; i<mapping.length(); i++){
            printCombination(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String args){
        String str = "23";
        printCombination(str,0,"");
    }
}

//Timne complexity: O(4^n) because for each digit we have 4 options
