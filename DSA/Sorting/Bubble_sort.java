//Time complexity:- O(n^2)

class Bubble_sort{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};

        //bubble sort
        //outer loop just works as a counter
        for(int i=0;  i<arr.length-1; i++){

            //inner loop is used to compare and swap
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}