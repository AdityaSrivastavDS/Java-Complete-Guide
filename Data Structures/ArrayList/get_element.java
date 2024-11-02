//for using ArrayList first we have to import its package
import java.util.ArrayList;

class get_element{
    public static void main(String args[]){

        //defining ArrayList of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        //adding elements to the list
        //using .add()
        list.add(0);
        list.add(1);
        list.add(2);

        //get elements
       //using .get() wed have to pass index of element as parameter
       System.out.print(list.get(1));

    }
}

