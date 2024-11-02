//Place tiles of size 1 x m ina floor of size n x m

class place_tiles {
     public static int placeTiles(int n, int m){
        //base case
        //when n will be equal to m then we will have two ways to place tiles
        if(n == m){
            return 2;
        }

        /*when n is less than m then we will have only one way to place tiles
        otherwise the floor will get out of bound*/
        if(n < m){
            return 1;
        }
        //vertically
        int verticalPlacements = placeTiles(n-m, m);

        //horizontal
        int horizontalPlacements =  placeTiles(n-1, m);

        //total placements
        return verticalPlacements + horizontalPlacements;
     }
     public static void main(String args[]){
        int n = 4, m = 2;
        System.out.println("No. of ways to fill tiles on floor: "+placeTiles(n, m));
     }
}
