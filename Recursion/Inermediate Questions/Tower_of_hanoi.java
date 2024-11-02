

class Tower_of_hanoi {
    public static void towerofHanoi(int n, char source, char helper, char destination){
        //base case
            if(n == 1){
                System.out.println("Transfer disk 1 from "+source+" to "+destination);
                return;
            }

            //helper will be destination for n-1 disks and destination will become helper
            //n-1 because we are moving n-1 disks from source to helper
            towerofHanoi(n-1, source, destination, helper);

            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);

            //source will be helper for n-1 disks and helper will become source
            towerofHanoi(n-1,helper,source,destination);
        } 
        public static void main(String args[]){
        //number of disks
        int n = 3;

        //source, destination, helper
        towerofHanoi(n,'S','H','D');
    }
}

//Time Complexity: O(2^n) as there are 2 recursive calls
