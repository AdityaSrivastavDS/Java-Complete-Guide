package OOPS;

class box{
    double width;
    double height;
    double depth;
}
class boxdemo{
    public static void main(String args[]){
        //creating object for the box class
        box mybox = new box();
        
        //declaration of variable to store volume of box
        double volume;

        //assigning values to the variables
        mybox.width = 10;
        mybox.height = 6;
        mybox.depth = 9;

        volume = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume: "+volume);

    }
}