/*Count total paths in a maze to move from (0,0) to (n,m)
    Conditions:
    1.right
    2.Downwards
    we can move only in two directions*/

public class count_total_path {
    public static int countPaths(int i, int j, int n, int m){
        //base case
        //we reach to boundary and moving out of cell
        if(i == n || j == m){
            return 0;
        }
        //we don't have any path to move
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);

        //move right
        int rightPaths = countPaths(i, j+1, n, m);

        //Total paths
        return downPaths+rightPaths;
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        
        //In beginning the index of both i and j will be 0
        int totalPaths = countPaths(0,0,n,m);

        System.out.print("Total paths to move in maze: "+totalPaths);
    }
}
