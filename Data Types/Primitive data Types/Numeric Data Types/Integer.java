//int data type in Java is a 32-bit signed two's complement integer. It has a range from -2,147,483,648 to 2,147,483,647.
//The default value of an int in Java is 0.
//Performing arithmetic operations on int values beyond their maximum limit (2,147,483,647) can result in overflow, causing unexpected behavior.

class type {
    public static void main(String arg[]) {
        //32 bit
        int a = 10;   
        int b = 30;  

        short c = 100;  //16 bit

        long d = 1000000000;   //64 bit

        byte e = 127;   //8 bit

        System.out.println("The sum of a and b is: " + (a + b));
        System.out.println("The sum of a and c is: " + (a + c));
        System.out.println("The sum of a and d is: " + (a + d));
        System.out.println("The sum of a and e is: " + (a + e));

    }
}

