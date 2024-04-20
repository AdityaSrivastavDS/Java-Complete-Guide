//Print numbers from 5 to 1 using recursion
class numbers{
    public static void printNum(int n){
        //base case
        if(n == 0){
            return;
        }
        //recursive case
        System.out.println(n);
        printNum(n-1);   //recursive call
    }
    public static void main(String args[]){
        int n = 5;

        printNum(n); 
    }
}

// Time Complexity: O(n)  as we are calling the function n times
// Space Complexity: O(n) as we are using stack memory for n times

/*Stack Overflow:-
        1.If we increase the value of n to a very large number, then we will get stack overflow error.
        2.Stack overflow error occurs when the stack memory is full.
        3.Stack memory is used to store local variables and function call.
        4.If we will not define any base case in recursion, then the function will call itself infinite times and the stack memory will be full.
 */

