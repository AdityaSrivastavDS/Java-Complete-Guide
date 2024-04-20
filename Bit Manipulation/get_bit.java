/*we count the position or index from right to left  instead of left to right
Binary bumber:- 1 0 1 0 0 1
    Position:-  5 4 3 2 1 0  */

/*
  Bit Mask: 1<<i   left shift 1 by i times
  Operation: AND
*/

class get_bit{
    public static void main(String args[]){
        //number
        int n = 5;

        //position of bit
        int pos = 2;

        int bitMask = 1<<pos;

        //check if bit is 1 or 0
        if((bitMask & n) == 0){
            System.out.print("bit was zero");
        }else{
            System.out.print("bit was one");
        }
        
    }
}
