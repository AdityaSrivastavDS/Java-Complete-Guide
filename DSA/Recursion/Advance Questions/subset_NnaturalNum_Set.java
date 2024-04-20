//Print all the subsets of a set of first n natural numbers

import java.util.ArrayList;

class subset_NnaturalNum_Set {
    //print the subset
    public static void printSubset(ArrayList<Integer> subset){
         for(int i=0; i<subset.size(); i++){
             System.out.print(subset.get(i)+" ");
         }
         System.out.println();
    } 
    public static void findSubsets(int n, ArrayList<Integer> subset){
        //base case
        if(n == 0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
   

    public static void main(String args[]){
        int n = 3;

        //creating an empty arraylist of integer type using ArrayList<> data structure
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
