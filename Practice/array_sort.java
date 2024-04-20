class array_sort{
    public static void main(String args[]){
        int arr[] = {9,1,4,2,8,5,6};

        int n = arr.length-1;

        //sorting
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}