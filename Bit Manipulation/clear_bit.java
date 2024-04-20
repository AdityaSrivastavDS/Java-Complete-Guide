/*clear bit operation is to convert bit 1 to 0
   Bit Mask: 1<<i
   operation:- AND with NOT
 */

class clear_bit {
    public static void main(String args[]){
        //numer
        int n = 5;

        //position
        int i = 2;

        //bit mask
        int bitMask = 1<<i;

        //not of mask
        bitMask = ~bitMask;

        //and with mask
        int new_num = bitMask & n;
        System.out.println(new_num);
    }
}
