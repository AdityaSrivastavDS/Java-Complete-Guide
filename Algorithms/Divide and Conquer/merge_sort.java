//Time Complexity: O(nlogn) because we are dividing array into two parts and then merging them


class merge_sort{
    //will merge array
    public static void conquer(int arr[], int si, int mid, int ei){
        int merge[] = new int[ei - si+1]; //ei - si+1 

        //tracking index of first array
        int idx1 = si;
        //tracking index of second array
        int idx2 = mid+1;
        //tracking index of merged array
        int x = 0;

        //this will store sorted elements of array
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                //storing sorted elements of array
                merge[x++] = arr[idx1++];
               
            }else{
                merge[x++] = arr[idx2++];
            }
        }
        //if any element left in first array
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        //if any element left in second array
        while(idx2 <= ei){
            merge[x++] = arr[idx2++];
        }
        
        //copying sorted elements of  merge array into original array
        for(int i=0, j = si; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }

    //will divide array
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        //calculating mid
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr, si, mid, ei);
    }
    public static void main(String args[]){

        //define unsorted array
        int arr[] = {6, 3, 9, 5, 2, 8};

        //size of array
        int n = arr.length;

        //calling divide function
        divide(arr, 0, n-1);

        //printong sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}