class right_pyramid {
    public static void main(String args[]){
        int n = 4;

        for(int i=1; i<=n; i++){
            
            //fpr printing spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            //for printing stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
