
/*we want output like:-
 * *****
 * *****
 * *****
 * *****
 */



class solid_rectangle{
    public static void main(String args[]){
        int i,j;
        
        //outer loop is for row
        for(i = 1; i <= 4; i++){

            //inner loop is for column
            for(j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();  //for new line
        }

    }
}