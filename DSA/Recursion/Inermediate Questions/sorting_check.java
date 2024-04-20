//Check if an array is sorted(Strictly increasing)
//Array:- {1,2,3,4,5}

class sorting_check {
    public static boolean isSorted(int arr[], int idx){
        //base case
        if(idx == arr.length-1){
            return true;
        }
        //recursive case
        if(arr[idx] < arr[idx+1]){
            //array is sorted till now
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int idx = 0;

        System.out.println(isSorted(arr,idx));


    }
}


//Time Complexity:- O(n) where n is the length of the array
