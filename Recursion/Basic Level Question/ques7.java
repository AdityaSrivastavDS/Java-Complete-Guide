

//Print x^n (Stack hieght = logn)
//Time Complexity: O(logn) as we are dividing n by 2 in each recursive call
 
class stack_height{
    public static int calcPower(int x, int n){
        //base case 1
        //if n is 0, then x^0 = 1
        if(n == 0){
            return 1;
        }
        //base case 2
        //if x is 0, then x^0 = 0
        if(x == 0){
            return 0;
        }
        //if n is even
        if(n%2 == 0){
           return calcPower(x, n/2) * calcPower(x, n/2);
        }
        //if n is odd
        else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String args[]){
        int x = 2, n = 6;
        
        int ans = calcPower(x,n);
        System.out.println(ans);
    }
}
