

//print fibonacci series upto nth term
class fibonacci{
      public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }  
        int c = a+b;
        System.out.println(c);

        /*b will become a 
           * c will become b
           * n will decrease by 1
        */
        printFib(b, c, n-1); 
      }
      public static void main(String args[]){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        //n-2 will decrease the previous two terms 
        printFib(a, b, n-2);
      }
}