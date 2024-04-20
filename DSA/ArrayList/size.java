import java.util.ArrayList;

public class size {
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

        //getting size of list
        //using .size()
        System.out.print(list.size());
    }
}
