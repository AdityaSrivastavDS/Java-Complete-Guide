import java.util.ArrayList;

public class set_element {
    public static void main(String args[]){

        //defining ArrayList of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        //adding elements to the list
        //using .add()
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //changing already existing elements in list
        //using .set(index,element)
        list.set(0, 5);

        //printing the list
        System.out.print(list);
    }
}
