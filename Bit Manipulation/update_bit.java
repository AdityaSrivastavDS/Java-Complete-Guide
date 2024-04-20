/*update bit operation is used to update any bit of at any position
 either updating 1 to 0
 or updating 0 to 1

 For updating 1 to 0- Bit Mask:- 1<<i
        Operation: AND with NOT

For updating 0 to 1- Bit Mask:- 1<<i
Operation: OR
  */

  import java.util.*;

class update_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //asking for operation from user
        System.out.print("Enter operation: ");
        int opr = sc.nextInt();

        
        //number
        int n = 5;

        //position
        int pos = 1;

        //bit mask
        int bitMask = 1<<pos;

        
       
        //if opr is 1 then set bit
        if(opr == 1){
         
            int new_number = n | bitMask;
            System.out.println(new_number);
        }

        //if opr is 0 then clear bit
        else{
            bitMask = ~bitMask;  //NOT
            int new_num = n & bitMask;
            System.out.println(new_num);
        }

        sc.close();
    }
}
