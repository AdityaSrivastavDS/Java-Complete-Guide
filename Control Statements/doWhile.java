class doWhile {
    
    public static void main(String[] args) {
        int i = 0;
        do {         // do while loop is used to execute a block of code repeatedly until a given condition is satisfied.
            System.out.println(i);
            i++;
        } 
        while (i < 5);     // while loop is used to execute a block of code repeatedly until a given condition is satisfied.
    }
}



/*  do-while and while loop works similarly but only difference between both of them is that while terminates
    the loop if the condition is false but do-while executes the loop at least once and then checks the condition.
    In while loop, condition is checked first and then the statements inside loop are executed but in do-while loop,
    statements are executed first and then the condition is checked.
*/

//while loop also known as entry controlled loop and do-while loop also known as exit controlled loop.
//do-while loop is also known as post tested loop because condition is checked after statements are executed.