public class floor_tiles {
    //defining class to find no. of pathways
    public static int tiles_fit(int n , int m){
        //base condition
        if(n < m){
            return 1;
        }
        if(n == m){
            return 2;
        }
        //vertical ways
        int vert = tiles_fit(n-m, m);

        //horizontal ways
        int hor = tiles_fit(n-1,m);

        //Total no of pathways
        return vert + hor;
    }
    //main class 
    public static void main(String args[]){
        System.out.print("Total no. of pathways to put tiles on floor is: "+tiles_fit(4,2));
    }
}
