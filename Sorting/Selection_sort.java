class Selection_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {9,1,6,2,5,7};

        //selection sort
        //find the smallest element and swap it with the first element
        for(int i=0; i<arr.length-1; i++){
            //find the smallest element
            int smallest = i;

            //check for smallest element
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }

            }
            //swap the smallest element with the first element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}

//Time Complexity:- O(n^2)
