package Matrix;

class second_way {
    public static void main(String args[]){

        //defining elements at time of matrix creation
        int mt[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //declaring variables which will be used for iteration
        int i,j;

        //now we will access the matrix using loop
        for(i=0; i < mt.length ;i++){
            for(j=0; j < mt.length ;j++){
                System.out.print(mt[i][j] +"\t");
            }
            System.out.println();  //this is used to print new line
        }

    }
}

