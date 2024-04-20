class arr{
    public static void main(String args[]){
        
        //first way to create array
        //we define the size of array first and initialize its value later
        int arr[] = new int[3];

        //initializing values of array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //now we will access the array using loop
        //we will use .length to access teh array as we can't directly compary array
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}