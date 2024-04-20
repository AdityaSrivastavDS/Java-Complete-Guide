package OOPS.Inheritance;

class A {
      int i,j;
      void showIJ(){
        System.out.println("I = "+i);
        System.out.println("J = "+j);
      }
}
class B extends A{
    int k;
    void showK(){
        System.out.println("K = "+k);
    }
    void sum(){
        System.out.println("Sum = "+(i+j+k));
    }
}
class single_inheritance{
    public static void main(String args[]){
        A superobj = new A();
        B subobj = new B();

        superobj.i = 10;
        superobj.j = 6;
        superobj.showIJ();

        subobj.i = 9;
        subobj.j = 2;
        subobj.k = 4;

        subobj.showIJ();
        subobj.showK();
        subobj.sum();

    }
}
