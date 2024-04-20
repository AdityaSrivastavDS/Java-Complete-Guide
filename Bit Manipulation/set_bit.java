/*
    Bit Mask: 1<<i   left shift 1 by i times
    Operation: OR

    set bit operation is used to set a bit to 1
    if bit is 0 then it will be set to 1
    and if bit is 1 then it will remain 1
 */


class set_bit {
    public static void main(String args[]){
        //number
        int n = 5;

        //position of bit
        int pos = 1;

        //create bit mask
        int bitMask = 1<<pos;
        
        //set bit
        int new_num = bitMask | n;
        System.out.print(new_num);
    }
}
