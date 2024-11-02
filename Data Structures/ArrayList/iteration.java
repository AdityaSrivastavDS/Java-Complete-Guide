//for using ArrayList first we have to import its package
import java.util.ArrayList;

class iiteration{
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

        //iterating through the list
        for(int i=0; i<list.size(); i++){
            //using .get() wed have to pass index of element as parameter
            System.out.println(list.get(i));
        }

    }
}

