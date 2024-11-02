

//print factorial of n number using recursion

class ques4 {
    public static void printFact(int num, int fact){
        //base case
        if(num == 1){
            fact*=num;
            System.out.print(fact);
            return;
        }
        fact*=num;
        printFact(num-1, fact);
    }
    public static void main(String args[]){
        
        printFact(4, 1);
    }
}