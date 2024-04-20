//Print x^n (Stack Height = n)

class stack_height {
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

        /*will calculate x^n-1
         * and then multiply it with x
         * because x*x^n-1 = x^n
         */
        int xPowenm1 = calcPower(x, n-1);
        int xPown = x * xPowenm1;
        return xPown;
    }
    public static void main(String args[]){
        int x = 2, n = 5;
        
        int ans = calcPower(x,n);
        System.out.println(ans);
    }
}
