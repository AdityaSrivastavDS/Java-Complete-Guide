//for using ArrayList first we have to import its package
import java.util.ArrayList;
import java.util.Collections;

class sorting_list{
    public static void main(String args[]){

        //defining ArrayList of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        //adding elements to the list
        //using .add()
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(4);

        //sorting the list using Collection.sort()
        Collections.sort(list);
        System.out.print(list);

    }
}

