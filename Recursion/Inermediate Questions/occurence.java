

//Find the 1st and last occurence of an element in a string

class occurence {

    /*We had declared first and last static because we wanted to keep them same during entire program
     * first will be -1 till we find the first occurence of the element
     * last will be -1 till we find the last occurence of the element
     */
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element){

        //Base Case
        if(idx == str.length()){
            System.out.println("First Occurence: "+first);
            System.out.println("Last Occurence: "+last);
            return;
        }

        //currChar will store the current character
        char currChar = str.charAt(idx);

        //If the current character is equal to the element then we will check if first is -1 or not
        if(currChar == element){
            //If first is -1 then we will store the index of the current character in first
            if(first == -1){
                first = idx;
            }
            //If first is not -1 then we will store the index of the current character in last
            else{
                last = idx;
            }
        }

        //We will call the function again with idx+1
        findOccurence(str,idx+1,element);
    }
    public static void main(String args[]){
        String str = "abaacda";
        char element = 'a';

        findOccurence(str,0,element);

    }
}
