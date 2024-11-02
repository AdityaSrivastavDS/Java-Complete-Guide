class Insertion_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {9,1,6,2,5,7};

        //insertion sort

        //insert an element from unsorted array to its correct position in sorted array
        for(int i=1; i<arr.length; i++){

            //current element
            int current = arr[i];

            //check for correct position
            int j = i-1;
            //if current element is smaller than the element at jth position, shift the element to the right
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                //decrement j
                j--;
            }
            //insert the current element at its correct position
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
