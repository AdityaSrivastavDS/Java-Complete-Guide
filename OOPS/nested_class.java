package OOPS;

class outer_class {
    int x = 5;

    //defining another class inside the outer class
    class inner_class{
        int y = 6;
    }
}
public class nested_class{
    public static void main(String args[]){
        outer_class ot = new outer_class();

        //outer class object referring inner class object
        outer_class.inner_class  ic = ot.new inner_class();
        
        System.out.println(ot.x);
        System.out.println(ic.y);

    }
}
