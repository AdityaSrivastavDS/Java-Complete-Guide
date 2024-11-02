

//print numbers from 1 to 5 using recursion

class ques2 {
    public static void printNumb(int num){
        //base case
        if(num == 6){
            return;
        }
        //recursive case
        System.out.println(num);
        printNumb(num+1);
    }
    public static void main(String args[]){
        int num = 1;

        printNumb(num);
    }
}

// Time Complexity: O(n)  as we are calling the function n times