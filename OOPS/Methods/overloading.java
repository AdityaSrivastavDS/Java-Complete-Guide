package OOPS.Methods;

/*In java we can create different methods of same name until unless there 
parameters are different */

class overloading {
    void test(){
        System.out.println("No parameter is passed");
    }
    void test( int a){
        System.out.println("A = " +a);
    }
    void test(int a, int b){
        System.out.println("A = " +a);
        System.out.println("B = " +b);
    }
    void test(double x, double y){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
class overload_use{
    public static void main(String args[]){
        overloading obj = new overloading();

        //calling all methods with values
        obj.test();
        obj.test(10);
        obj.test(12,20);
        obj.test(25.55,26.66);
    }
}
