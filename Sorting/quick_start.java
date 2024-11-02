class quick_sort{

    public static int partition(int arr[], int low, int high){
        //pivot will store the last element of the array
        int pivot = arr[high];
        
        //i will store the index of the smaller element
        int i = low-1;

        //j will traverse the array to check for the elements which are smaller than pivot
        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                //increment i for making space for the smaller element in array before pivot
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap
        i++;
        //placing the pivoit at its correct position
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;  //pivot index
    }
    public static void quickSort(int arr[], int low, int high){
       if(low < high){
        //pidx will store the index of pivot
        int pidx = partition(arr, low, high);

        //recursively calling quickSort for the left and right part of the pivot
        
        //pidx-1 because pivot is already at its correct position
        //this call will sort the left part of the pivot
        quickSort(arr, low, pidx-1);

        //pidx+1 because pivot is already at its correct position
        //this call will sort the right part of the pivot
        quickSort(arr, pidx+1, high);
       }
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        //calling function
        /*In beginning 
         * low = 0 means first element of array
         * high = n-1 means last element of array
         */
        quickSort(arr, 0, n-1);

        //printing sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


/*Time Complexity
 * worst case: O(n^2)  while merge sort is O(nlogn)
 * best case: O(nlogn)
 * average case: O(nlogn)
*/

//Worst case of quick sort occurs when pivot is always the smallest or largest element