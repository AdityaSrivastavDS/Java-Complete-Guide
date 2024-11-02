//Move all 'x' to the end of the string

class move_char {
    /*Here:-
    1.str is the main string
    2.idx will hold the index of each character of  string
    3.count will hold the number of 'x' in the string
    4.newString will hold the new string formed after moving all 'x' to the end of the string
     */

    public static void moveAllx(String str, int idx, int count, String newString){
        if(idx == str.length()){

            //adding 'x' to the end of the string
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        //will hold current character of the string
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllx(str,idx+1,count,newString);
        }else{
            newString += currChar; //adding current character to the new string
            moveAllx(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str = "axxbdxce";
        int idx = 0;
        int count = 0;

        //new string will be empty at beginning
        String newString = "";

        moveAllx(str,idx,count,newString);
    }
}


//Time Complexity:- O(2n) as O(n + n(count))  so final time complexity is O(n)
//wher n is length of string