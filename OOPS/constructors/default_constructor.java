

class box {
    int length;
    int width;

    //creating constructor
    //In java the name of cobnsructor is same as the name of class in which it is defined
    //Constructor is called when an object of the class is created
    //Constructor is used to initialize the object
    //Constructor does not have any return type

    box(){
        length = 10;
        width = 12;
    }
}
class box_use{
    public static void main(String args[]){
        box  b1 = new box();
        System.out.println("Length: "+b1.length);
        System.out.println("Width: "+b1.width);
    }
}
