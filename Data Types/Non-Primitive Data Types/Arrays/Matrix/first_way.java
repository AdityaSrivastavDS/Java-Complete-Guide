package Matrix;

//matrix which is also known as 2D array which is a collection of 1D arrays

class first_way {
    public static void main(String args[]){
        //first way to create matrix
        //we define the size of matrix first and initialize its value later
        int mtr[][] = new int[3][3];

        //initializing values of matrix
        mtr[0][0] = 1;
        mtr[0][1] = 2;
        mtr[0][2] = 3;

        mtr[1][0] = 4;
        mtr[1][1] = 5;
        mtr[1][2] = 6;

        mtr[2][0] = 7;
        mtr[2][1] = 8;
        mtr[2][2] = 9;

        //now we will access the matrix using loop
        //we will use .length to access teh matrix as we can't directly compary matrix
        for(int i=0; i < mtr.length; i++){
            for(int j=0; j < mtr.length; j++){
                System.out.print(mtr[i][j]+"\t");  // \t is used to give tab space
            }
            System.out.println();  
        }
    }
}
