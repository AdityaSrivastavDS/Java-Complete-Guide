//Importing ArrayList from Java Class
import java.util.ArrayList;
class list_sort {
    public static void main(String args[]){
        
        //declaring list
        ArrayList<Integer> list = new ArrayList<>();

        //adding elements to list
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);
        list.add(4);

        //printing array
        System.out.println("Before Sorting: ");
        System.out.print(list +" ");

        //sorting list
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size()-1; j++){
                if(list.get(j) > list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        //printing sorted list
        System.out.println("\nAfter Sorting: ");
        System.out.print(list +" ");
    }
}
