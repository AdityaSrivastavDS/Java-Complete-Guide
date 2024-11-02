

//print sum of first n natural numbers using recursion

class ques3 {
    public static void printSum(int start, int end, int sum ){
        //base case
        if(start == end){
            sum+=start;
            System.out.println(sum);
            return;
        }
        sum += start;
        printSum(start+1, end, sum);
    }
    public static void main(String args[]){
        printSum(1, 5, 0);
    }
}
