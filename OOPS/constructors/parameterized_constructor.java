

class box {
    int length;
    int width;
    int height;

    //creating parameterized constructor
    //In this type of constructor we pass parameters to the constructor
    //and values are initialized at time of object creation
    box(int x, int y, int z){
        length = x;
        width = y;
        height = z;
    }
}
class box_use{
    public static void main(String args[]){

        //initializing values of length, width and height at time of object creation
        box  b1 = new box(10, 12, 14);

        System.out.println("Length: "+b1.length);
        System.out.println("Width: "+b1.width);
        System.out.println("Height: "+b1.height);
    }
}
