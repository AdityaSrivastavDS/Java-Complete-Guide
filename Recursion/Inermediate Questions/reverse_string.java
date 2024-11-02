

class reverse_string {
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));

        //idx-1 will move index in reverse direction
        printRev(str, idx-1);
    }
    public static void main(String args[]){
        String str = "Python";
        
        //str.length()-1 will give last index of string
        printRev(str,str.length()-1 );
    }
}

//Time Complexity: O(n) where n is length of string
