class array_sum{

    public static void sumarr(int arr[], int n, int sums){
        
        if(n == arr.length-1){
            sums += arr[n];
            sumarr(arr, n+1, sums);
            return;
        }
        sums += arr[n];
        System.out.print(sums);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,6,9};
        int sums = 0;
        int n = arr.length;
        sumarr(arr,n+1,sums);
    }
}