

class box {
    int length;
    int breadth;
    int hieght;

    box(){
        length = 5;
        breadth = 6;
        hieght = 8;
    }
    box(int x){
        length = breadth = hieght = x;
    }
    box(int x,int y,int z){
        length = x;
        breadth = y;
        hieght = z;
    }
    int volume(){
        return length*breadth*hieght;
    }
}
class box_use{
    public static void main(String args[]){
        int vol;
        box b1 = new box();
        box b2 = new box();
        box b3 = new box();

        vol = b1.volume();
        System.out.println("Volume of box1 is "+vol);
        vol = b2.volume();
        System.out.println("Volume of box2 is "+vol);
        vol = b3.volume();
        System.out.println("Volume of box3 is "+vol);
    }
}

